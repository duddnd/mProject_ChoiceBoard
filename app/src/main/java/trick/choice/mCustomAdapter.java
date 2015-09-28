package trick.choice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class mCustomAdapter extends BaseAdapter{

    ArrayList<List_Data> mlist;         // 리스트 데이터를 쌓아 두는 배열
    Context context;

    public mCustomAdapter(Context context){
        super();
        this.context = context;
    }

    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public Object getItem(int position) {
        return mlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /*
        * position : 선택된 ListView의 Position값
        * convertView : 이전 View가 저장되어있음
        * parent : 부모 View
        * */

        List_Data mdata;
        mdata = new List_Data();

       //Context context = parent.getContext();
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) parent.getContext()/*context*/.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listviewitem, parent);

            mdata.Left_bt = (Button)convertView.findViewById(R.id.left_bt);
            mdata.Right_bt = (Button)convertView.findViewById(R.id.right_bt);

            mdata.Left_tx = (TextView)convertView.findViewById(R.id.left_text);
            mdata.Right_tx = (TextView)convertView.findViewById(R.id.right_text);

            mdata.Left_iv = (ImageView)convertView.findViewById(R.id.left_imageview);
            mdata.Right_iv = (ImageView)convertView.findViewById(R.id.right_imageview);

            convertView.setTag(mdata);
            //change
        }
        return convertView;
    }

    class List_Data{

        Button Left_bt, Right_bt;
        TextView Left_tx, Right_tx;
        ImageView Left_iv, Right_iv;
    }

    public void add(Button Left_bt, Button Right_bt, TextView Left_tx, TextView Right_tx, ImageView Left_iv,ImageView Right_iv){
        List_Data mdata = new List_Data();
        mdata.Left_bt = Left_bt;
        mdata.Right_bt = Right_bt;
        mdata.Left_iv = Left_iv;
        mdata.Right_iv = Right_iv;
        mdata.Left_tx = Left_tx;
        mdata.Right_tx = Right_tx;

        mlist.add(mdata);
    }

}
