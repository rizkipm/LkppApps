package superheroku.id.co.lkppapps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import superheroku.id.co.lkppapps.R;
import superheroku.id.co.lkppapps.newapp.NewLkppResponse;

/**
 * Created by Leon Jiang(xiaoyaoworm) on 3/20/16.
 * https://github.com/xiaoyaoworm
 */

public class DataAdapter extends ArrayAdapter<NewLkppResponse> {

    public static final String DELETE_SUCCESSFULLY = "Delete successfully";
    public static final String DELETE_BOOK_FAILED = "DELETE BOOK FAILED";
    public static final String DELETE_BOOK_FAILED_PLEASE_CHECK_THE_LOG = "DELETE Book Failed, please check the log.";
    public static final String EXCEPTION = "Exception: ";

    private List<NewLkppResponse> books;
    private int layoutResource;

    public DataAdapter(Context context, int layoutResource, List<NewLkppResponse> books) {
        super(context, android.R.layout.simple_list_item_2, books);
        this.layoutResource = layoutResource;
        this.books = books;
    }

    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public NewLkppResponse getItem(int position) {
        return books.get(position);
    }

    @Override
    public long getItemId(int position) {
        return books.get(position).getIdSatker();
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            view = layoutInflater.inflate(layoutResource, null);
        }
        NewLkppResponse book = getItem(position);
        if (book != null) {
            TextView title = (TextView) view.findViewById(R.id.bookName);
//            TextView author = (TextView) view.findViewById(R.id.bookAuthor);

            title.setText(books.get(position).getJenisPengadaan());
//            author.setText(books.get(position).getNamaKpa());


        }

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ListView parent = (ListView) v.getParent();
//                int pos = parent.getPositionForView(v);
//                int bookId = books.get(pos).getId();
//                Context context = getContext();
//                Intent booksDetailsIntent = new Intent(context, BooksDetailActivity.class);
//                booksDetailsIntent.putExtra("bookID", bookId);
//                booksDetailsIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                context.startActivity(booksDetailsIntent);

            }
        });


        return view;
    }




}
