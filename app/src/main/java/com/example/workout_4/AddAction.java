package com.example.workout_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.workout_4.Adapter.ChoseActionListAdapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AddAction extends AppCompatActivity {

    Boolean is_select_all = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_action);

        final ListView listView = (ListView) findViewById(R.id.chest_menu);
        final Button select_all = (Button) findViewById(R.id.button9);
        final Button select_checked = (Button) findViewById(R.id.button10);

        //選到哪個部位?
        Bundle bundle = AddAction.this.getIntent().getExtras();
        int choosed = bundle.getInt("choosed");

        //新增動作區
        final List<ActionInfo> actionInfoArrayList = new ArrayList<>();


        switch (choosed){
            case 1:{
                actionInfoArrayList.add(new ActionInfo(false,"槓鈴系列",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,getString(R.string.BarbellBenchPress),R.drawable.chest_1,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,getString(R.string.UpBarbellBenchPress),R.drawable.chest_2,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,getString(R.string.DownBarbellBenchPress),R.drawable.chest_3,"","",0));

                actionInfoArrayList.add(new ActionInfo(false,"啞鈴系列",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,getString(R.string.DumbbellBenchPress),R.drawable.chest_4,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,getString(R.string.UpDumbbellBenchPress),R.drawable.chest_5,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,getString(R.string.DownDumbbellBenchPress),R.drawable.chest_6,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,getString(R.string.BirdDownDumbbellBenchPress),R.drawable.chest_7,"","",0));

                actionInfoArrayList.add(new ActionInfo(false,"滑輪系列",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,getString(R.string.WaterSmoothWheelCoreAntiRotation),R.drawable.chest_8,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,getString(R.string.BenchPressOnInclinedPulley),R.drawable.chest_9,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,getString(R.string.SupinePulleyBird),R.drawable.chest_10,"","",0));

                actionInfoArrayList.add(new ActionInfo(false,"機械式",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"機械式平胸推舉",R.drawable.chest_11,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"機械式上胸推舉",R.drawable.chest_12,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"機械輔助背後臂屈伸",R.drawable.chest_13,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"蝴蝶機 飛鳥",R.drawable.chest_14,"","",0));
                break;
            }
            case 2:{
                actionInfoArrayList.add(new ActionInfo(false,"槓鈴系列",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"槓鈴硬舉",R.drawable.back_1,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"槓鈴划船",R.drawable.back_2,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"地雷管划船",R.drawable.back_3,"","",0));

                actionInfoArrayList.add(new ActionInfo(false,"滑輪系列",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"坐姿划船",R.drawable.back_4,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"胸前下拉",R.drawable.back_5,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"拉繩划船",R.drawable.back_6,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"上斜拉繩划船",R.drawable.back_7,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"上斜拉繩上背下拉",R.drawable.back_8,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"(寬握)滑輪上背下拉",R.drawable.back_9,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"(窄握)滑輪上背下拉",R.drawable.back_10,"","",0));

                actionInfoArrayList.add(new ActionInfo(false,"機械式",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"機械式單臂划船",R.drawable.back_11,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"機械式高划船",R.drawable.back_12,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"機械輔助引體向上",R.drawable.back_13,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"引體向上",R.drawable.back_14,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"蝴蝶機 反向飛鳥",R.drawable.back_15,"","",0));
                break;
            }
            case 3:{
                actionInfoArrayList.add(new ActionInfo(false,"槓鈴系列",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"槓鈴深蹲",R.drawable.leg_1,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"槓鈴硬舉",R.drawable.back_1,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"六角槓硬舉",R.drawable.leg_2,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"箱式深蹲",R.drawable.leg_3,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"槓鈴前蹲",R.drawable.leg_4,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"槓鈴提踵",R.drawable.leg_5,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"槓鈴後跨步",R.drawable.leg_6,"","",0));

                actionInfoArrayList.add(new ActionInfo(false,"啞鈴系列",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"啞鈴深蹲",R.drawable.leg_7,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"啞鈴弓箭步",R.drawable.leg_8,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"啞鈴提踵",R.drawable.leg_9,"","",0));

                actionInfoArrayList.add(new ActionInfo(false,"機械式",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"腿伸屈",R.drawable.leg_10,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"腿彎舉",R.drawable.leg_11,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"髖關節內收",R.drawable.leg_12,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"機械腿推舉",R.drawable.leg_13,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"提踵",R.drawable.leg_14,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"躺姿腿彎曲",R.drawable.leg_15,"","",0));

                break;
            }
            case 4:{
                actionInfoArrayList.add(new ActionInfo(false,"肩膀",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"肩膀(槓鈴系列)",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"頸後肩上推舉",R.drawable.hand_1,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"槓鈴片前平舉",R.drawable.hand_2,"","",0));

                actionInfoArrayList.add(new ActionInfo(false,"肩膀(啞鈴系列)",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"啞鈴交替前平舉",R.drawable.hand_3,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"單手啞鈴肩推",R.drawable.hand_4,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"坐姿啞鈴肩推",R.drawable.hand_5,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"坐姿啞鈴前平舉",R.drawable.hand_6,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"坐姿啞鈴側平舉",R.drawable.hand_7,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"俯身啞鈴側平舉",R.drawable.hand_8,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"上斜啞鈴聳肩",R.drawable.hand_9,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"上斜啞鈴肩前平舉",R.drawable.hand_10,"","",0));

                actionInfoArrayList.add(new ActionInfo(false,"肩膀(滑輪系列)",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"面拉",R.drawable.hand_11,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"滑輪側平舉",R.drawable.hand_12,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"拉繩肩前平舉",R.drawable.hand_13,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"垂直拉繩核心抗旋轉",R.drawable.hand_14,"","",0));

                actionInfoArrayList.add(new ActionInfo(false,"二頭肌",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"二頭肌(槓鈴系列)",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"蜘蛛彎舉",R.drawable.hand_15,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"彎曲槓彎舉",R.drawable.hand_16,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"二頭集中彎舉",R.drawable.hand_17,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"(寬握式)槓鈴彎舉",R.drawable.hand_18,"","",0));

                actionInfoArrayList.add(new ActionInfo(false,"二頭肌(啞鈴系列)",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"坐姿啞鈴彎舉",R.drawable.hand_19,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"啞鈴交替彎舉",R.drawable.hand_20,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"垂式二頭彎舉",R.drawable.hand_21,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"上斜二頭彎舉",R.drawable.hand_22,"","",0));

                actionInfoArrayList.add(new ActionInfo(false,"二頭肌(滑輪系列)",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"二頭肌彎舉",R.drawable.hand_23,"","",0));

                actionInfoArrayList.add(new ActionInfo(false,"三頭肌",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"三頭肌(槓鈴系列)",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"法式推舉",R.drawable.hand_24,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"槓鈴三頭屈伸",R.drawable.hand_25,"","",0));

                actionInfoArrayList.add(new ActionInfo(false,"三頭肌(啞鈴系列)",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"啞鈴頸後臂屈伸",R.drawable.hand_26,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"下斜啞鈴三頭屈伸",R.drawable.hand_27,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"上斜啞鈴三頭屈伸",R.drawable.hand_28,"","",0));

                actionInfoArrayList.add(new ActionInfo(false,"三頭肌(滑輪系列)",0,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"滑輪三頭肌下壓",R.drawable.hand_29,"","",0));
                actionInfoArrayList.add(new ActionInfo(false,"上斜三頭屈伸",R.drawable.hand_30,"","",0));
                break;
            }

        }


        final ChoseActionListAdapter adapter = new ChoseActionListAdapter(this,actionInfoArrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ActionInfo model = actionInfoArrayList.get(position);

                if(model.isSelected())
                    model.setSelected(false);
                else
                    model.setSelected(true);

                if(model.getFlag()==0)
                    model.setSelected(false);

                actionInfoArrayList.set(position,model);

                //now update adapter
                adapter.updateRecords(actionInfoArrayList);
            }
        });

        select_all.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!is_select_all) {
                    for(int i = 0 ;i < actionInfoArrayList.size() ;i++){
                        ActionInfo model = actionInfoArrayList.get(i);
                        if(model.getFlag()!=0)
                            model.setSelected(true);
                        actionInfoArrayList.set(i,model);
                        //now update adapter
                        adapter.updateRecords(actionInfoArrayList);
                    }
                    is_select_all = true;
                    select_all.setText("取消全選");
                }
                else{
                    for(int i = 0 ;i < actionInfoArrayList.size() ;i++){
                        ActionInfo model = actionInfoArrayList.get(i);
                        model.setSelected(false);
                        actionInfoArrayList.set(i,model);
                        //now update adapter
                        adapter.updateRecords(actionInfoArrayList);
                    }
                    is_select_all = false;
                    select_all.setText("全選");
                }

            }
        });

        select_checked.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle bundle = new Bundle();

                bundle.putSerializable("List", (Serializable) actionInfoArrayList);

                intent.putExtras(bundle);
                setResult(RESULT_OK,intent);

                AddAction.this.finish();
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (keyCode == KeyEvent.KEYCODE_BACK )
        {
            Intent intent = getIntent();
            final List<ActionInfo> users = new ArrayList<>();
            Bundle bundle = new Bundle();
            bundle.putSerializable("List", (Serializable) users);
            intent.putExtras(bundle);

            setResult(RESULT_OK,intent);

            AddAction.this.finish();
        }

        return false;

    }
}
