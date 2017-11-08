package preshrunk.cyberpunk.typecast.iconoclast.unfolding;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Tab1 extends Fragment implements TabInterface {

    private TabHost mTabHost;
    private Button mButton;
    private TextView mTextView;
    public Tab1(){}
    int i = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab1, container, false);

        mTextView = (TextView) rootView.findViewById(R.id.tab1TextView);

        mButton = (Button) rootView.findViewById(R.id.tab1button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               i += 1;

                mTextView.setText(MsgLog.arrayMsgLog[i]);
            }
        });

        return rootView;
    }

    public static Tab1 newInstance(int sectionNumber) {
        Tab1 fragment = new Tab1();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    
}