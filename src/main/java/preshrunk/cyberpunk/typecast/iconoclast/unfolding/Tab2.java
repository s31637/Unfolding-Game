/*package preshrunk.cyberpunk.typecast.iconoclast.unfolding;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Tab2  extends Fragment {

    private Button mButton;
    private TextView mTextView;
    public Tab2(){}
    String string1 = "tab2";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1, container, false);

        mTextView = (TextView) rootView.findViewById(R.id.textView);
        mTextView.setText(string1);

        mButton = (Button) rootView.findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string1 += "1";
                System.out.println(string1);

                mTextView.setText(string1);
            }
        });

        return rootView;
    }

    public static Tab2 newInstance(int sectionNumber) {
        Tab2 fragment = new Tab2();
        Bundle args = new Bundle();
        args.putInt("section number", sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
}*/