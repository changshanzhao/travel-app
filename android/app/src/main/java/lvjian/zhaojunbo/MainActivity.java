package lvjian.zhaojunbo;

import com.getcapacitor.BridgeActivity;
import com.getcapacitor.Logger;
import com.getcapacitor.PluginLoadException;
import com.getcapacitor.PluginManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BridgeActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bridgeBuilder.setInstanceState(savedInstanceState);
        getApplication().setTheme(com.getcapacitor.android.R.style.AppTheme_NoActionBar);
        setTheme(com.getcapacitor.android.R.style.AppTheme_NoActionBar);
        setContentView(com.getcapacitor.android.R.layout.bridge_layout_main);
        PluginManager loader = new PluginManager(getAssets());

        try {
            bridgeBuilder.addPlugins(loader.loadPluginClasses());
        } catch (PluginLoadException ex) {
            Logger.error("Error loading plugins.", ex);
        }

        this.load();
        Button lq = (Button) this.findViewById(com.getcapacitor.android.R.id.button10);
        Button dz = (Button) this.findViewById(com.getcapacitor.android.R.id.button9);
        lq.setOnClickListener(new ButtonListener_lq());
        dz.setOnClickListener(new ButtonListener_dz());
    }
    private class ButtonListener_lq implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Intent intent=new Intent(MainActivity.this,LvQuan.class);//设置切换对应activity
            startActivity(intent);//开始切换
        }
    }
    private class ButtonListener_dz implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Intent intent=new Intent(MainActivity.this,DingZhi.class);//设置切换对应activity
            startActivity(intent);//开始切换
        }
    }

}
