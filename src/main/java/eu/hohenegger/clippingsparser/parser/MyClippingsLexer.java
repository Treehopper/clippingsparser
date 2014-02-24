// $ANTLR 3.4 C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g 2011-11-13 20:24:20

package eu.hohenegger.clippingsparser.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MyClippingsLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int AMPM=4;
    public static final int DATE=5;
    public static final int DAY_OF_MONTH=6;
    public static final int DAY_OF_WEEK=7;
    public static final int DIGIT=8;
    public static final int HOUR=9;
    public static final int MIN=10;
    public static final int MONTH=11;
    public static final int NEWLINE=12;
    public static final int NUM=13;
    public static final int SEP=14;
    public static final int SP=15;
    public static final int TIME=16;
    public static final int UNICODE=17;
    public static final int YEAR=18;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MyClippingsLexer() {} 
    public MyClippingsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MyClippingsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:11:7: ( ', ' )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:11:9: ', '
            {
            match(", "); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:12:7: ( '-' )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:12:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:13:7: ( 'Bookmark' )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:13:9: 'Bookmark'
            {
            match("Bookmark"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:14:7: ( 'Highlight' )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:14:9: 'Highlight'
            {
            match("Highlight"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:15:7: ( 'Loc.' )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:15:9: 'Loc.'
            {
            match("Loc."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:16:7: ( 'Note' )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:16:9: 'Note'
            {
            match("Note"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:17:7: ( 'Page' )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:17:9: 'Page'
            {
            match("Page"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:18:7: ( 'on' )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:18:9: 'on'
            {
            match("on"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:19:7: ( '| Added on ' )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:19:9: '| Added on '
            {
            match("| Added on "); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "SP"
    public final void mSP() throws RecognitionException {
        try {
            int _type = SP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:162:5: ( ( ' ' )+ )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:162:7: ( ' ' )+
            {
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:162:7: ( ' ' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:162:7: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SP"

    // $ANTLR start "TIME"
    public final void mTIME() throws RecognitionException {
        try {
            int _type = TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:164:7: ( HOUR ':' MIN ' ' AMPM )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:164:9: HOUR ':' MIN ' ' AMPM
            {
            mHOUR(); 


            match(':'); 

            mMIN(); 


            match(' '); 

            mAMPM(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TIME"

    // $ANTLR start "HOUR"
    public final void mHOUR() throws RecognitionException {
        try {
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:167:2: ( ( ( '0' '1' .. '9' ) | ( '1' '0' .. '2' ) ) )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:167:4: ( ( '0' '1' .. '9' ) | ( '1' '0' .. '2' ) )
            {
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:167:4: ( ( '0' '1' .. '9' ) | ( '1' '0' .. '2' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                alt2=1;
            }
            else if ( (LA2_0=='1') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:167:5: ( '0' '1' .. '9' )
                    {
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:167:5: ( '0' '1' .. '9' )
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:167:6: '0' '1' .. '9'
                    {
                    match('0'); 

                    matchRange('1','9'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:167:22: ( '1' '0' .. '2' )
                    {
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:167:22: ( '1' '0' .. '2' )
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:167:23: '1' '0' .. '2'
                    {
                    match('1'); 

                    matchRange('0','2'); 

                    }


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HOUR"

    // $ANTLR start "MIN"
    public final void mMIN() throws RecognitionException {
        try {
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:169:2: ( ( ( '0' .. '5' DIGIT ) ) )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:169:4: ( ( '0' .. '5' DIGIT ) )
            {
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:169:4: ( ( '0' .. '5' DIGIT ) )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:169:5: ( '0' .. '5' DIGIT )
            {
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:169:5: ( '0' .. '5' DIGIT )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:169:6: '0' .. '5' DIGIT
            {
            matchRange('0','5'); 

            mDIGIT(); 


            }


            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MIN"

    // $ANTLR start "AMPM"
    public final void mAMPM() throws RecognitionException {
        try {
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:171:16: ( 'AM' | 'PM' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='A') ) {
                alt3=1;
            }
            else if ( (LA3_0=='P') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:171:18: 'AM'
                    {
                    match("AM"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:171:25: 'PM'
                    {
                    match("PM"); 



                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AMPM"

    // $ANTLR start "DATE"
    public final void mDATE() throws RecognitionException {
        try {
            int _type = DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:173:7: ( DAY_OF_WEEK ', ' MONTH ' ' DAY_OF_MONTH ', ' YEAR )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:173:9: DAY_OF_WEEK ', ' MONTH ' ' DAY_OF_MONTH ', ' YEAR
            {
            mDAY_OF_WEEK(); 


            match(", "); 



            mMONTH(); 


            match(' '); 

            mDAY_OF_MONTH(); 


            match(", "); 



            mYEAR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DATE"

    // $ANTLR start "YEAR"
    public final void mYEAR() throws RecognitionException {
        try {
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:177:5: ( '1' .. '9' DIGIT DIGIT DIGIT )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:177:7: '1' .. '9' DIGIT DIGIT DIGIT
            {
            matchRange('1','9'); 

            mDIGIT(); 


            mDIGIT(); 


            mDIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "YEAR"

    // $ANTLR start "MONTH"
    public final void mMONTH() throws RecognitionException {
        try {
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:181:5: ( 'January' | 'February' | 'March' | 'April' | 'May' | 'June' | 'July' | 'August' | 'September' | 'October' | 'November' | 'December' )
            int alt4=12;
            switch ( input.LA(1) ) {
            case 'J':
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='a') ) {
                    alt4=1;
                }
                else if ( (LA4_1=='u') ) {
                    int LA4_10 = input.LA(3);

                    if ( (LA4_10=='n') ) {
                        alt4=6;
                    }
                    else if ( (LA4_10=='l') ) {
                        alt4=7;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 10, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
                }
                break;
            case 'F':
                {
                alt4=2;
                }
                break;
            case 'M':
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3=='a') ) {
                    int LA4_11 = input.LA(3);

                    if ( (LA4_11=='r') ) {
                        alt4=3;
                    }
                    else if ( (LA4_11=='y') ) {
                        alt4=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 11, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;

                }
                }
                break;
            case 'A':
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4=='p') ) {
                    alt4=4;
                }
                else if ( (LA4_4=='u') ) {
                    alt4=8;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;

                }
                }
                break;
            case 'S':
                {
                alt4=9;
                }
                break;
            case 'O':
                {
                alt4=10;
                }
                break;
            case 'N':
                {
                alt4=11;
                }
                break;
            case 'D':
                {
                alt4=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:181:7: 'January'
                    {
                    match("January"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:182:7: 'February'
                    {
                    match("February"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:183:7: 'March'
                    {
                    match("March"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:184:7: 'April'
                    {
                    match("April"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:185:7: 'May'
                    {
                    match("May"); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:186:7: 'June'
                    {
                    match("June"); 



                    }
                    break;
                case 7 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:187:7: 'July'
                    {
                    match("July"); 



                    }
                    break;
                case 8 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:188:7: 'August'
                    {
                    match("August"); 



                    }
                    break;
                case 9 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:189:7: 'September'
                    {
                    match("September"); 



                    }
                    break;
                case 10 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:190:7: 'October'
                    {
                    match("October"); 



                    }
                    break;
                case 11 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:191:7: 'November'
                    {
                    match("November"); 



                    }
                    break;
                case 12 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:192:7: 'December'
                    {
                    match("December"); 



                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MONTH"

    // $ANTLR start "DAY_OF_MONTH"
    public final void mDAY_OF_MONTH() throws RecognitionException {
        try {
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:195:23: ( ( '0' '1' .. '9' ) | ( '1' .. '2' '0' .. '9' ) | '30' | '31' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt5=1;
                }
                break;
            case '1':
            case '2':
                {
                alt5=2;
                }
                break;
            case '3':
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3=='0') ) {
                    alt5=3;
                }
                else if ( (LA5_3=='1') ) {
                    alt5=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:195:25: ( '0' '1' .. '9' )
                    {
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:195:25: ( '0' '1' .. '9' )
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:195:26: '0' '1' .. '9'
                    {
                    match('0'); 

                    matchRange('1','9'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:195:42: ( '1' .. '2' '0' .. '9' )
                    {
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:195:42: ( '1' .. '2' '0' .. '9' )
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:195:43: '1' .. '2' '0' .. '9'
                    {
                    matchRange('1','2'); 

                    matchRange('0','9'); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:195:64: '30'
                    {
                    match("30"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:195:71: '31'
                    {
                    match("31"); 



                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DAY_OF_MONTH"

    // $ANTLR start "DAY_OF_WEEK"
    public final void mDAY_OF_WEEK() throws RecognitionException {
        try {
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:200:5: ( 'Monday' | 'Tuesday' | 'Wednesday' | 'Thursday' | 'Friday' | 'Saturday' | 'Sunday' )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 'M':
                {
                alt6=1;
                }
                break;
            case 'T':
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2=='u') ) {
                    alt6=2;
                }
                else if ( (LA6_2=='h') ) {
                    alt6=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'W':
                {
                alt6=3;
                }
                break;
            case 'F':
                {
                alt6=5;
                }
                break;
            case 'S':
                {
                int LA6_5 = input.LA(2);

                if ( (LA6_5=='a') ) {
                    alt6=6;
                }
                else if ( (LA6_5=='u') ) {
                    alt6=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 5, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:200:7: 'Monday'
                    {
                    match("Monday"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:201:7: 'Tuesday'
                    {
                    match("Tuesday"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:202:7: 'Wednesday'
                    {
                    match("Wednesday"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:203:7: 'Thursday'
                    {
                    match("Thursday"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:204:7: 'Friday'
                    {
                    match("Friday"); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:205:7: 'Saturday'
                    {
                    match("Saturday"); 



                    }
                    break;
                case 7 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:206:7: 'Sunday'
                    {
                    match("Sunday"); 



                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DAY_OF_WEEK"

    // $ANTLR start "SEP"
    public final void mSEP() throws RecognitionException {
        try {
            int _type = SEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:211:6: ( '==========' )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:211:8: '=========='
            {
            match("=========="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEP"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:216:9: ( ( '\\r' )? '\\n' )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:216:11: ( '\\r' )? '\\n'
            {
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:216:11: ( '\\r' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:216:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:218:5: ( '1' .. '9' ( DIGIT )* )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:218:7: '1' .. '9' ( DIGIT )*
            {
            matchRange('1','9'); 

            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:218:16: ( DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:223:19: ( ( '0' .. '9' ) )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "UNICODE"
    public final void mUNICODE() throws RecognitionException {
        try {
            int _type = UNICODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:225:10: ( '\\u0000' .. '\\u00FF' )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\u00FF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | SP | TIME | DATE | SEP | NEWLINE | NUM | UNICODE )
        int alt9=16;
        switch ( input.LA(1) ) {
        case ',':
            {
            int LA9_1 = input.LA(2);

            if ( (LA9_1==' ') ) {
                alt9=1;
            }
            else {
                alt9=16;
            }
            }
            break;
        case '-':
            {
            alt9=2;
            }
            break;
        case 'B':
            {
            int LA9_3 = input.LA(2);

            if ( (LA9_3=='o') ) {
                alt9=3;
            }
            else {
                alt9=16;
            }
            }
            break;
        case 'H':
            {
            int LA9_4 = input.LA(2);

            if ( (LA9_4=='i') ) {
                alt9=4;
            }
            else {
                alt9=16;
            }
            }
            break;
        case 'L':
            {
            int LA9_5 = input.LA(2);

            if ( (LA9_5=='o') ) {
                alt9=5;
            }
            else {
                alt9=16;
            }
            }
            break;
        case 'N':
            {
            int LA9_6 = input.LA(2);

            if ( (LA9_6=='o') ) {
                alt9=6;
            }
            else {
                alt9=16;
            }
            }
            break;
        case 'P':
            {
            int LA9_7 = input.LA(2);

            if ( (LA9_7=='a') ) {
                alt9=7;
            }
            else {
                alt9=16;
            }
            }
            break;
        case 'o':
            {
            int LA9_8 = input.LA(2);

            if ( (LA9_8=='n') ) {
                alt9=8;
            }
            else {
                alt9=16;
            }
            }
            break;
        case '|':
            {
            int LA9_9 = input.LA(2);

            if ( (LA9_9==' ') ) {
                alt9=9;
            }
            else {
                alt9=16;
            }
            }
            break;
        case ' ':
            {
            alt9=10;
            }
            break;
        case '0':
            {
            int LA9_11 = input.LA(2);

            if ( ((LA9_11 >= '1' && LA9_11 <= '9')) ) {
                alt9=11;
            }
            else {
                alt9=16;
            }
            }
            break;
        case '1':
            {
            int LA9_12 = input.LA(2);

            if ( ((LA9_12 >= '0' && LA9_12 <= '2')) ) {
                int LA9_34 = input.LA(3);

                if ( (LA9_34==':') ) {
                    alt9=11;
                }
                else {
                    alt9=15;
                }
            }
            else {
                alt9=15;
            }
            }
            break;
        case 'M':
            {
            int LA9_13 = input.LA(2);

            if ( (LA9_13=='o') ) {
                alt9=12;
            }
            else {
                alt9=16;
            }
            }
            break;
        case 'T':
            {
            int LA9_14 = input.LA(2);

            if ( (LA9_14=='h'||LA9_14=='u') ) {
                alt9=12;
            }
            else {
                alt9=16;
            }
            }
            break;
        case 'W':
            {
            int LA9_15 = input.LA(2);

            if ( (LA9_15=='e') ) {
                alt9=12;
            }
            else {
                alt9=16;
            }
            }
            break;
        case 'F':
            {
            int LA9_16 = input.LA(2);

            if ( (LA9_16=='r') ) {
                alt9=12;
            }
            else {
                alt9=16;
            }
            }
            break;
        case 'S':
            {
            int LA9_17 = input.LA(2);

            if ( (LA9_17=='a'||LA9_17=='u') ) {
                alt9=12;
            }
            else {
                alt9=16;
            }
            }
            break;
        case '=':
            {
            int LA9_18 = input.LA(2);

            if ( (LA9_18=='=') ) {
                alt9=13;
            }
            else {
                alt9=16;
            }
            }
            break;
        case '\r':
            {
            int LA9_19 = input.LA(2);

            if ( (LA9_19=='\n') ) {
                alt9=14;
            }
            else {
                alt9=16;
            }
            }
            break;
        case '\n':
            {
            alt9=14;
            }
            break;
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt9=15;
            }
            break;
        case '\u0000':
        case '\u0001':
        case '\u0002':
        case '\u0003':
        case '\u0004':
        case '\u0005':
        case '\u0006':
        case '\u0007':
        case '\b':
        case '\t':
        case '\u000B':
        case '\f':
        case '\u000E':
        case '\u000F':
        case '\u0010':
        case '\u0011':
        case '\u0012':
        case '\u0013':
        case '\u0014':
        case '\u0015':
        case '\u0016':
        case '\u0017':
        case '\u0018':
        case '\u0019':
        case '\u001A':
        case '\u001B':
        case '\u001C':
        case '\u001D':
        case '\u001E':
        case '\u001F':
        case '!':
        case '\"':
        case '#':
        case '$':
        case '%':
        case '&':
        case '\'':
        case '(':
        case ')':
        case '*':
        case '+':
        case '.':
        case '/':
        case ':':
        case ';':
        case '<':
        case '>':
        case '?':
        case '@':
        case 'A':
        case 'C':
        case 'D':
        case 'E':
        case 'G':
        case 'I':
        case 'J':
        case 'K':
        case 'O':
        case 'Q':
        case 'R':
        case 'U':
        case 'V':
        case 'X':
        case 'Y':
        case 'Z':
        case '[':
        case '\\':
        case ']':
        case '^':
        case '_':
        case '`':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
        case '{':
        case '}':
        case '~':
        case '\u007F':
        case '\u0080':
        case '\u0081':
        case '\u0082':
        case '\u0083':
        case '\u0084':
        case '\u0085':
        case '\u0086':
        case '\u0087':
        case '\u0088':
        case '\u0089':
        case '\u008A':
        case '\u008B':
        case '\u008C':
        case '\u008D':
        case '\u008E':
        case '\u008F':
        case '\u0090':
        case '\u0091':
        case '\u0092':
        case '\u0093':
        case '\u0094':
        case '\u0095':
        case '\u0096':
        case '\u0097':
        case '\u0098':
        case '\u0099':
        case '\u009A':
        case '\u009B':
        case '\u009C':
        case '\u009D':
        case '\u009E':
        case '\u009F':
        case '\u00A0':
        case '\u00A1':
        case '\u00A2':
        case '\u00A3':
        case '\u00A4':
        case '\u00A5':
        case '\u00A6':
        case '\u00A7':
        case '\u00A8':
        case '\u00A9':
        case '\u00AA':
        case '\u00AB':
        case '\u00AC':
        case '\u00AD':
        case '\u00AE':
        case '\u00AF':
        case '\u00B0':
        case '\u00B1':
        case '\u00B2':
        case '\u00B3':
        case '\u00B4':
        case '\u00B5':
        case '\u00B6':
        case '\u00B7':
        case '\u00B8':
        case '\u00B9':
        case '\u00BA':
        case '\u00BB':
        case '\u00BC':
        case '\u00BD':
        case '\u00BE':
        case '\u00BF':
        case '\u00C0':
        case '\u00C1':
        case '\u00C2':
        case '\u00C3':
        case '\u00C4':
        case '\u00C5':
        case '\u00C6':
        case '\u00C7':
        case '\u00C8':
        case '\u00C9':
        case '\u00CA':
        case '\u00CB':
        case '\u00CC':
        case '\u00CD':
        case '\u00CE':
        case '\u00CF':
        case '\u00D0':
        case '\u00D1':
        case '\u00D2':
        case '\u00D3':
        case '\u00D4':
        case '\u00D5':
        case '\u00D6':
        case '\u00D7':
        case '\u00D8':
        case '\u00D9':
        case '\u00DA':
        case '\u00DB':
        case '\u00DC':
        case '\u00DD':
        case '\u00DE':
        case '\u00DF':
        case '\u00E0':
        case '\u00E1':
        case '\u00E2':
        case '\u00E3':
        case '\u00E4':
        case '\u00E5':
        case '\u00E6':
        case '\u00E7':
        case '\u00E8':
        case '\u00E9':
        case '\u00EA':
        case '\u00EB':
        case '\u00EC':
        case '\u00ED':
        case '\u00EE':
        case '\u00EF':
        case '\u00F0':
        case '\u00F1':
        case '\u00F2':
        case '\u00F3':
        case '\u00F4':
        case '\u00F5':
        case '\u00F6':
        case '\u00F7':
        case '\u00F8':
        case '\u00F9':
        case '\u00FA':
        case '\u00FB':
        case '\u00FC':
        case '\u00FD':
        case '\u00FE':
        case '\u00FF':
            {
            alt9=16;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 9, 0, input);

            throw nvae;

        }

        switch (alt9) {
            case 1 :
                // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:1:10: T__19
                {
                mT__19(); 


                }
                break;
            case 2 :
                // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:1:16: T__20
                {
                mT__20(); 


                }
                break;
            case 3 :
                // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:1:22: T__21
                {
                mT__21(); 


                }
                break;
            case 4 :
                // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:1:28: T__22
                {
                mT__22(); 


                }
                break;
            case 5 :
                // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:1:34: T__23
                {
                mT__23(); 


                }
                break;
            case 6 :
                // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:1:40: T__24
                {
                mT__24(); 


                }
                break;
            case 7 :
                // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:1:46: T__25
                {
                mT__25(); 


                }
                break;
            case 8 :
                // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:1:52: T__26
                {
                mT__26(); 


                }
                break;
            case 9 :
                // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:1:58: T__27
                {
                mT__27(); 


                }
                break;
            case 10 :
                // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:1:64: SP
                {
                mSP(); 


                }
                break;
            case 11 :
                // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:1:67: TIME
                {
                mTIME(); 


                }
                break;
            case 12 :
                // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:1:72: DATE
                {
                mDATE(); 


                }
                break;
            case 13 :
                // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:1:77: SEP
                {
                mSEP(); 


                }
                break;
            case 14 :
                // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:1:81: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 15 :
                // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:1:89: NUM
                {
                mNUM(); 


                }
                break;
            case 16 :
                // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:1:93: UNICODE
                {
                mUNICODE(); 


                }
                break;

        }

    }


 

}