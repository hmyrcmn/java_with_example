import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.table.TableCellRenderer;
import javax.swing.JFrame;
import javax.swing.JTable;
public class TableCellExample 
{
    public static void main( String[] args ) 
    {
        JTable table = new JTable( new ExampleTableModel() ); 
        TableCellRenderer renderer = new CustomTableCellRenderer();
        try
        {
            table.setDefaultRenderer( Class.forName
               ( "java.lang.Integer" ), renderer );
        }
        catch( ClassNotFoundException ex )
        {
            System.exit( 0 );
        }
        JFrame frame = new JFrame();
        frame.addWindowListener( 
            new WindowAdapter() 
            {
                public void windowClosing(WindowEvent e) 
                {
                    System.exit(0);
                }
            }
        );
        frame.getContentPane().add( table );
        frame.pack();
        frame.setVisible( true );
    }
}