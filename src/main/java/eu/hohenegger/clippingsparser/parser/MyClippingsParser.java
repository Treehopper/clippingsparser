// $ANTLR 3.4 C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g 2011-11-13 20:24:20

package eu.hohenegger.clippingsparser.parser;
import eu.hohenegger.clippingsparser.model.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MyClippingsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AMPM", "DATE", "DAY_OF_MONTH", "DAY_OF_WEEK", "DIGIT", "HOUR", "MIN", "MONTH", "NEWLINE", "NUM", "SEP", "SP", "TIME", "UNICODE", "YEAR", "', '", "'-'", "'Bookmark'", "'Highlight'", "'Loc.'", "'Note'", "'Page'", "'on'", "'| Added on '"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MyClippingsParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MyClippingsParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[20+1];
         

    }

    public String[] getTokenNames() { return MyClippingsParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g"; }


        public List<Clipping> result = new ArrayList<Clipping>();



    // $ANTLR start "clippings"
    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:32:1: clippings : ( item SEP NEWLINE )* EOF ;
    public final void clippings() throws RecognitionException {
        int clippings_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }

            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:32:11: ( ( item SEP NEWLINE )* EOF )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:32:14: ( item SEP NEWLINE )* EOF
            {
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:32:14: ( item SEP NEWLINE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= AMPM && LA1_0 <= MONTH)||LA1_0==NUM||(LA1_0 >= SP && LA1_0 <= 27)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:32:15: item SEP NEWLINE
            	    {
            	    pushFollow(FOLLOW_item_in_clippings65);
            	    item();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    match(input,SEP,FOLLOW_SEP_in_clippings67); if (state.failed) return ;

            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_clippings69); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_clippings73); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, clippings_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "clippings"


    protected static class item_scope {
        Clipping itm;
    }
    protected Stack item_stack = new Stack();



    // $ANTLR start "item"
    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:34:1: item : title ( bookmark | highlight | note ) ;
    public final void item() throws RecognitionException {
        item_stack.push(new item_scope());
        int item_StartIndex = input.index();

        MyClippingsParser.title_return title1 =null;



        		((item_scope)item_stack.peek()).itm = new Clipping();
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }

            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:44:2: ( title ( bookmark | highlight | note ) )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:44:4: title ( bookmark | highlight | note )
            {
            pushFollow(FOLLOW_title_in_item101);
            title1=title();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:44:10: ( bookmark | highlight | note )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==SP) ) {
                    switch ( input.LA(3) ) {
                    case 21:
                        {
                        alt2=1;
                        }
                        break;
                    case 22:
                        {
                        alt2=2;
                        }
                        break;
                    case 24:
                        {
                        alt2=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:44:11: bookmark
                    {
                    pushFollow(FOLLOW_bookmark_in_item104);
                    bookmark();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:44:22: highlight
                    {
                    pushFollow(FOLLOW_highlight_in_item108);
                    highlight();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:44:34: note
                    {
                    pushFollow(FOLLOW_note_in_item112);
                    note();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		((item_scope)item_stack.peek()).itm.setTitle((title1!=null?input.toString(title1.start,title1.stop):null));
            	}

            }

            if ( state.backtracking==0 ) {
            		result.add(((item_scope)item_stack.peek()).itm);
            	}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, item_StartIndex); }

            item_stack.pop();
        }
        return ;
    }
    // $ANTLR end "item"


    public static class title_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "title"
    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:50:1: title : (~ ( NEWLINE | SEP ) )+ NEWLINE ;
    public final MyClippingsParser.title_return title() throws RecognitionException {
        MyClippingsParser.title_return retval = new MyClippingsParser.title_return();
        retval.start = input.LT(1);

        int title_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:50:7: ( (~ ( NEWLINE | SEP ) )+ NEWLINE )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:51:2: (~ ( NEWLINE | SEP ) )+ NEWLINE
            {
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:51:2: (~ ( NEWLINE | SEP ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= AMPM && LA3_0 <= MONTH)||LA3_0==NUM||(LA3_0 >= SP && LA3_0 <= 27)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:
            	    {
            	    if ( (input.LA(1) >= AMPM && input.LA(1) <= MONTH)||input.LA(1)==NUM||(input.LA(1) >= SP && input.LA(1) <= 27) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match(input,NEWLINE,FOLLOW_NEWLINE_in_title139); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, title_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "title"



    // $ANTLR start "bookmark"
    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:90:1: bookmark : '-' SP 'Bookmark' SP location SP added_on NEWLINE NEWLINE ;
    public final void bookmark() throws RecognitionException {
        int bookmark_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }

            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:91:2: ( '-' SP 'Bookmark' SP location SP added_on NEWLINE NEWLINE )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:91:4: '-' SP 'Bookmark' SP location SP added_on NEWLINE NEWLINE
            {
            match(input,20,FOLLOW_20_in_bookmark156); if (state.failed) return ;

            match(input,SP,FOLLOW_SP_in_bookmark158); if (state.failed) return ;

            match(input,21,FOLLOW_21_in_bookmark160); if (state.failed) return ;

            match(input,SP,FOLLOW_SP_in_bookmark162); if (state.failed) return ;

            pushFollow(FOLLOW_location_in_bookmark164);
            location();

            state._fsp--;
            if (state.failed) return ;

            match(input,SP,FOLLOW_SP_in_bookmark166); if (state.failed) return ;

            pushFollow(FOLLOW_added_on_in_bookmark168);
            added_on();

            state._fsp--;
            if (state.failed) return ;

            match(input,NEWLINE,FOLLOW_NEWLINE_in_bookmark170); if (state.failed) return ;

            match(input,NEWLINE,FOLLOW_NEWLINE_in_bookmark172); if (state.failed) return ;

            if ( state.backtracking==0 ) {
            		((item_scope)item_stack.peek()).itm.setType(Clipping.DocType.BOOKMARK);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, bookmark_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "bookmark"



    // $ANTLR start "note"
    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:98:1: note : '-' SP 'Note' SP location SP added_on NEWLINE content ;
    public final void note() throws RecognitionException {
        int note_StartIndex = input.index();

        MyClippingsParser.content_return content2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }

            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:99:2: ( '-' SP 'Note' SP location SP added_on NEWLINE content )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:99:4: '-' SP 'Note' SP location SP added_on NEWLINE content
            {
            match(input,20,FOLLOW_20_in_note189); if (state.failed) return ;

            match(input,SP,FOLLOW_SP_in_note191); if (state.failed) return ;

            match(input,24,FOLLOW_24_in_note193); if (state.failed) return ;

            match(input,SP,FOLLOW_SP_in_note195); if (state.failed) return ;

            pushFollow(FOLLOW_location_in_note197);
            location();

            state._fsp--;
            if (state.failed) return ;

            match(input,SP,FOLLOW_SP_in_note199); if (state.failed) return ;

            pushFollow(FOLLOW_added_on_in_note201);
            added_on();

            state._fsp--;
            if (state.failed) return ;

            match(input,NEWLINE,FOLLOW_NEWLINE_in_note203); if (state.failed) return ;

            pushFollow(FOLLOW_content_in_note205);
            content2=content();

            state._fsp--;
            if (state.failed) return ;

            if ( state.backtracking==0 ) {
            		((item_scope)item_stack.peek()).itm.setType(Clipping.DocType.NOTE);
            		((item_scope)item_stack.peek()).itm.setContent((content2!=null?input.toString(content2.start,content2.stop):null));
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, note_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "note"



    // $ANTLR start "highlight"
    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:106:1: highlight : '-' SP 'Highlight' SP location SP ( '-' toloc= NUM )? SP added_on NEWLINE ( NEWLINE | content ) ;
    public final void highlight() throws RecognitionException {
        int highlight_StartIndex = input.index();

        Token toloc=null;
        MyClippingsParser.content_return content3 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }

            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:107:2: ( '-' SP 'Highlight' SP location SP ( '-' toloc= NUM )? SP added_on NEWLINE ( NEWLINE | content ) )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:107:4: '-' SP 'Highlight' SP location SP ( '-' toloc= NUM )? SP added_on NEWLINE ( NEWLINE | content )
            {
            match(input,20,FOLLOW_20_in_highlight221); if (state.failed) return ;

            match(input,SP,FOLLOW_SP_in_highlight223); if (state.failed) return ;

            match(input,22,FOLLOW_22_in_highlight225); if (state.failed) return ;

            match(input,SP,FOLLOW_SP_in_highlight227); if (state.failed) return ;

            pushFollow(FOLLOW_location_in_highlight229);
            location();

            state._fsp--;
            if (state.failed) return ;

            match(input,SP,FOLLOW_SP_in_highlight231); if (state.failed) return ;

            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:107:39: ( '-' toloc= NUM )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:107:40: '-' toloc= NUM
                    {
                    match(input,20,FOLLOW_20_in_highlight235); if (state.failed) return ;

                    toloc=(Token)match(input,NUM,FOLLOW_NUM_in_highlight239); if (state.failed) return ;

                    if ( state.backtracking==0 ) {((item_scope)item_stack.peek()).itm.setToLocation((toloc!=null?toloc.getText():null));}

                    }
                    break;

            }


            match(input,SP,FOLLOW_SP_in_highlight245); if (state.failed) return ;

            pushFollow(FOLLOW_added_on_in_highlight247);
            added_on();

            state._fsp--;
            if (state.failed) return ;

            match(input,NEWLINE,FOLLOW_NEWLINE_in_highlight249); if (state.failed) return ;

            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:107:117: ( NEWLINE | content )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==NEWLINE) ) {
                alt5=1;
            }
            else if ( ((LA5_0 >= AMPM && LA5_0 <= MONTH)||(LA5_0 >= NUM && LA5_0 <= 27)) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:107:118: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_highlight252); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:107:128: content
                    {
                    pushFollow(FOLLOW_content_in_highlight256);
                    content3=content();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		((item_scope)item_stack.peek()).itm.setType(Clipping.DocType.HIGHLIGHT);
            		((item_scope)item_stack.peek()).itm.setContent((content3!=null?input.toString(content3.start,content3.stop):null));
            		
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, highlight_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "highlight"



    // $ANTLR start "location"
    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:114:1: location : ( 'on' SP 'Page' | 'Loc.' ) SP fromloc= NUM ;
    public final void location() throws RecognitionException {
        int location_StartIndex = input.index();

        Token fromloc=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }

            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:115:2: ( ( 'on' SP 'Page' | 'Loc.' ) SP fromloc= NUM )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:115:5: ( 'on' SP 'Page' | 'Loc.' ) SP fromloc= NUM
            {
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:115:5: ( 'on' SP 'Page' | 'Loc.' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:115:6: 'on' SP 'Page'
                    {
                    match(input,26,FOLLOW_26_in_location273); if (state.failed) return ;

                    match(input,SP,FOLLOW_SP_in_location275); if (state.failed) return ;

                    match(input,25,FOLLOW_25_in_location277); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:115:23: 'Loc.'
                    {
                    match(input,23,FOLLOW_23_in_location281); if (state.failed) return ;

                    }
                    break;

            }


            match(input,SP,FOLLOW_SP_in_location284); if (state.failed) return ;

            fromloc=(Token)match(input,NUM,FOLLOW_NUM_in_location288); if (state.failed) return ;

            if ( state.backtracking==0 ) {
            		((item_scope)item_stack.peek()).itm.setFromLocation((fromloc!=null?fromloc.getText():null));
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, location_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "location"


    public static class content_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "content"
    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:124:1: content : (~ ( NEWLINE ) )+ NEWLINE ;
    public final MyClippingsParser.content_return content() throws RecognitionException {
        MyClippingsParser.content_return retval = new MyClippingsParser.content_return();
        retval.start = input.LT(1);

        int content_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:125:2: ( (~ ( NEWLINE ) )+ NEWLINE )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:125:4: (~ ( NEWLINE ) )+ NEWLINE
            {
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:125:4: (~ ( NEWLINE ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= AMPM && LA7_0 <= MONTH)||(LA7_0 >= NUM && LA7_0 <= 27)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:
            	    {
            	    if ( (input.LA(1) >= AMPM && input.LA(1) <= MONTH)||(input.LA(1) >= NUM && input.LA(1) <= 27) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            match(input,NEWLINE,FOLLOW_NEWLINE_in_content313); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, content_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "content"



    // $ANTLR start "added_on"
    // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:130:1: added_on : '| Added on ' d= DATE ', ' t= TIME NEWLINE ;
    public final void added_on() throws RecognitionException {
        int added_on_StartIndex = input.index();

        Token d=null;
        Token t=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }

            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:131:2: ( '| Added on ' d= DATE ', ' t= TIME NEWLINE )
            // C:\\Users\\max\\Desktop\\MyClippingsParser\\MyClippings.g:131:4: '| Added on ' d= DATE ', ' t= TIME NEWLINE
            {
            match(input,27,FOLLOW_27_in_added_on327); if (state.failed) return ;

            d=(Token)match(input,DATE,FOLLOW_DATE_in_added_on330); if (state.failed) return ;

            match(input,19,FOLLOW_19_in_added_on331); if (state.failed) return ;

            t=(Token)match(input,TIME,FOLLOW_TIME_in_added_on334); if (state.failed) return ;

            match(input,NEWLINE,FOLLOW_NEWLINE_in_added_on336); if (state.failed) return ;

            if ( state.backtracking==0 ) {
            		((item_scope)item_stack.peek()).itm.setDate((d!=null?d.getText():null) + ", " + (t!=null?t.getText():null));
            		//((item_scope)item_stack.peek()).itm.setTime((t!=null?t.getText():null));
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, added_on_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "added_on"

    // Delegated rules


 

    public static final BitSet FOLLOW_item_in_clippings65 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEP_in_clippings67 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NEWLINE_in_clippings69 = new BitSet(new long[]{0x000000000FFFAFF0L});
    public static final BitSet FOLLOW_EOF_in_clippings73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_title_in_item101 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_bookmark_in_item104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_highlight_in_item108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_item112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_title139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_bookmark156 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SP_in_bookmark158 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_bookmark160 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SP_in_bookmark162 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_location_in_bookmark164 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SP_in_bookmark166 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_added_on_in_bookmark168 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NEWLINE_in_bookmark170 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NEWLINE_in_bookmark172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_note189 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SP_in_note191 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_note193 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SP_in_note195 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_location_in_note197 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SP_in_note199 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_added_on_in_note201 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NEWLINE_in_note203 = new BitSet(new long[]{0x000000000FFFEFF0L});
    public static final BitSet FOLLOW_content_in_note205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_highlight221 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SP_in_highlight223 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_highlight225 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SP_in_highlight227 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_location_in_highlight229 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SP_in_highlight231 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_20_in_highlight235 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_NUM_in_highlight239 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SP_in_highlight245 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_added_on_in_highlight247 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NEWLINE_in_highlight249 = new BitSet(new long[]{0x000000000FFFFFF0L});
    public static final BitSet FOLLOW_NEWLINE_in_highlight252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_content_in_highlight256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_location273 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SP_in_location275 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_location277 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_23_in_location281 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SP_in_location284 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_NUM_in_location288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_content313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_added_on327 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DATE_in_added_on330 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_added_on331 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_TIME_in_added_on334 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NEWLINE_in_added_on336 = new BitSet(new long[]{0x0000000000000002L});

}