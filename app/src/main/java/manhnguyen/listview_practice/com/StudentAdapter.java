package manhnguyen.listview_practice.com;

import android.content.Context;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class StudentAdapter extends BaseAdapter {

    Context context;
    int layout;
    List<Student> studentList;

    public StudentAdapter(Context context, int layout, List<Student> studentList) {
        this.context = context;
        this.layout = layout;
        this.studentList = studentList;
    }

    @Override
    public int getCount() {
        return studentList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        ImageView avatar;
        TextView name, clazz;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = new ViewHolder();
        if (view == null) {
            LayoutInflater intentFilter = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = intentFilter.inflate(layout, null);
            holder.name = (TextView) view.findViewById(R.id.name);
            holder.clazz = (TextView) view.findViewById(R.id.clazz);
            holder.avatar = (ImageView) view.findViewById(R.id.avatar);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        Student student = studentList.get(i);
        holder.name.setText(student.getName());
        holder.clazz.setText(student.getClazz());
        holder.avatar.setImageResource(student.getImage());
        Animation animation= AnimationUtils.loadAnimation(context,R.anim.animation_scale);
        view.startAnimation(animation);
        return view;
    }
}
