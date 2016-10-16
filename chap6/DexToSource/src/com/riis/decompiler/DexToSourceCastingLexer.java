// $ANTLR 3.4 src/com/riis/decompiler/DexToSourceCasting.g 2012-09-20 16:27:34

	package com.riis.decompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DexToSourceCastingLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int ADD_INT=4;
    public static final int CLASS=5;
    public static final int COMMENT=6;
    public static final int CONST_16=7;
    public static final int CONST_4=8;
    public static final int CONST_HIGH_16=9;
    public static final int CONST_STRING=10;
    public static final int DIGIT=11;
    public static final int FIELD=12;
    public static final int FINAL=13;
    public static final int GOTO=14;
    public static final int IDENT=15;
    public static final int IF_GE=16;
    public static final int INIT=17;
    public static final int INT_TO_CHAR=18;
    public static final int INVOKE_DIRECT=19;
    public static final int INVOKE_VIRTUAL=20;
    public static final int LABEL=21;
    public static final int LIMIT=22;
    public static final int LINE=23;
    public static final int METHODEND=24;
    public static final int METHODSTRT=25;
    public static final int MOVE_RESULT_OBJECT=26;
    public static final int NEW_INSTANCE=27;
    public static final int PUBLIC=28;
    public static final int REGISTERS=29;
    public static final int RETURN_VOID=30;
    public static final int SGET_OBJECT=31;
    public static final int SOURCE=32;
    public static final int STATIC=33;
    public static final int SUPER=34;
    public static final int WS=35;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public DexToSourceCastingLexer() {} 
    public DexToSourceCastingLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DexToSourceCastingLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "src/com/riis/decompiler/DexToSourceCasting.g"; }

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:11:7: ( '\"' )
            // src/com/riis/decompiler/DexToSourceCasting.g:11:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:12:7: ( '(' )
            // src/com/riis/decompiler/DexToSourceCasting.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:13:7: ( ')' )
            // src/com/riis/decompiler/DexToSourceCasting.g:13:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:14:7: ( '.' )
            // src/com/riis/decompiler/DexToSourceCasting.g:14:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:15:7: ( '.java' )
            // src/com/riis/decompiler/DexToSourceCasting.g:15:9: '.java'
            {
            match(".java"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:16:7: ( '/' )
            // src/com/riis/decompiler/DexToSourceCasting.g:16:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:17:7: ( ':' )
            // src/com/riis/decompiler/DexToSourceCasting.g:17:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:18:7: ( ';' )
            // src/com/riis/decompiler/DexToSourceCasting.g:18:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:19:7: ( '=' )
            // src/com/riis/decompiler/DexToSourceCasting.g:19:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:20:7: ( 'L' )
            // src/com/riis/decompiler/DexToSourceCasting.g:20:9: 'L'
            {
            match('L'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:21:7: ( 'V' )
            // src/com/riis/decompiler/DexToSourceCasting.g:21:9: 'V'
            {
            match('V'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:22:7: ( '[L' )
            // src/com/riis/decompiler/DexToSourceCasting.g:22:9: '[L'
            {
            match("[L"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:23:7: ( ']' )
            // src/com/riis/decompiler/DexToSourceCasting.g:23:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:24:7: ( 'parameter[' )
            // src/com/riis/decompiler/DexToSourceCasting.g:24:9: 'parameter['
            {
            match("parameter["); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:25:7: ( 'this:' )
            // src/com/riis/decompiler/DexToSourceCasting.g:25:9: 'this:'
            {
            match("this:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:26:7: ( 'v' )
            // src/com/riis/decompiler/DexToSourceCasting.g:26:9: 'v'
            {
            match('v'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:27:7: ( '{' )
            // src/com/riis/decompiler/DexToSourceCasting.g:27:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:28:7: ( '}' )
            // src/com/riis/decompiler/DexToSourceCasting.g:28:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:238:6: ( '.class' )
            // src/com/riis/decompiler/DexToSourceCasting.g:238:11: '.class'
            {
            match(".class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "PUBLIC"
    public final void mPUBLIC() throws RecognitionException {
        try {
            int _type = PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:239:7: ( 'public' )
            // src/com/riis/decompiler/DexToSourceCasting.g:239:12: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PUBLIC"

    // $ANTLR start "STATIC"
    public final void mSTATIC() throws RecognitionException {
        try {
            int _type = STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:240:7: ( 'static' )
            // src/com/riis/decompiler/DexToSourceCasting.g:240:12: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STATIC"

    // $ANTLR start "FINAL"
    public final void mFINAL() throws RecognitionException {
        try {
            int _type = FINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:241:6: ( 'final' )
            // src/com/riis/decompiler/DexToSourceCasting.g:241:11: 'final'
            {
            match("final"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FINAL"

    // $ANTLR start "SUPER"
    public final void mSUPER() throws RecognitionException {
        try {
            int _type = SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:242:6: ( '.super' )
            // src/com/riis/decompiler/DexToSourceCasting.g:242:11: '.super'
            {
            match(".super"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUPER"

    // $ANTLR start "SOURCE"
    public final void mSOURCE() throws RecognitionException {
        try {
            int _type = SOURCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:243:7: ( '.source' )
            // src/com/riis/decompiler/DexToSourceCasting.g:243:12: '.source'
            {
            match(".source"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SOURCE"

    // $ANTLR start "FIELD"
    public final void mFIELD() throws RecognitionException {
        try {
            int _type = FIELD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:244:6: ( '.field' )
            // src/com/riis/decompiler/DexToSourceCasting.g:244:11: '.field'
            {
            match(".field"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FIELD"

    // $ANTLR start "METHODSTRT"
    public final void mMETHODSTRT() throws RecognitionException {
        try {
            int _type = METHODSTRT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:245:11: ( '.method' )
            // src/com/riis/decompiler/DexToSourceCasting.g:245:15: '.method'
            {
            match(".method"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "METHODSTRT"

    // $ANTLR start "METHODEND"
    public final void mMETHODEND() throws RecognitionException {
        try {
            int _type = METHODEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:246:10: ( '.end method' )
            // src/com/riis/decompiler/DexToSourceCasting.g:246:14: '.end method'
            {
            match(".end method"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "METHODEND"

    // $ANTLR start "INIT"
    public final void mINIT() throws RecognitionException {
        try {
            int _type = INIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:247:5: ( '<init>' )
            // src/com/riis/decompiler/DexToSourceCasting.g:247:10: '<init>'
            {
            match("<init>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INIT"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:248:6: ( '.limit' )
            // src/com/riis/decompiler/DexToSourceCasting.g:248:11: '.limit'
            {
            match(".limit"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "REGISTERS"
    public final void mREGISTERS() throws RecognitionException {
        try {
            int _type = REGISTERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:249:10: ( 'registers' )
            // src/com/riis/decompiler/DexToSourceCasting.g:249:14: 'registers'
            {
            match("registers"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REGISTERS"

    // $ANTLR start "LINE"
    public final void mLINE() throws RecognitionException {
        try {
            int _type = LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:250:5: ( '.line' )
            // src/com/riis/decompiler/DexToSourceCasting.g:250:10: '.line'
            {
            match(".line"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE"

    // $ANTLR start "INVOKE_DIRECT"
    public final void mINVOKE_DIRECT() throws RecognitionException {
        try {
            int _type = INVOKE_DIRECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:252:14: ( 'invoke-direct' )
            // src/com/riis/decompiler/DexToSourceCasting.g:252:17: 'invoke-direct'
            {
            match("invoke-direct"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INVOKE_DIRECT"

    // $ANTLR start "INVOKE_VIRTUAL"
    public final void mINVOKE_VIRTUAL() throws RecognitionException {
        try {
            int _type = INVOKE_VIRTUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:253:15: ( 'invoke-virtual' )
            // src/com/riis/decompiler/DexToSourceCasting.g:253:18: 'invoke-virtual'
            {
            match("invoke-virtual"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INVOKE_VIRTUAL"

    // $ANTLR start "MOVE_RESULT_OBJECT"
    public final void mMOVE_RESULT_OBJECT() throws RecognitionException {
        try {
            int _type = MOVE_RESULT_OBJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:254:19: ( 'move-result-object' )
            // src/com/riis/decompiler/DexToSourceCasting.g:254:21: 'move-result-object'
            {
            match("move-result-object"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOVE_RESULT_OBJECT"

    // $ANTLR start "NEW_INSTANCE"
    public final void mNEW_INSTANCE() throws RecognitionException {
        try {
            int _type = NEW_INSTANCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:255:13: ( 'new-instance' )
            // src/com/riis/decompiler/DexToSourceCasting.g:255:16: 'new-instance'
            {
            match("new-instance"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEW_INSTANCE"

    // $ANTLR start "RETURN_VOID"
    public final void mRETURN_VOID() throws RecognitionException {
        try {
            int _type = RETURN_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:256:12: ( 'return-void' )
            // src/com/riis/decompiler/DexToSourceCasting.g:256:15: 'return-void'
            {
            match("return-void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN_VOID"

    // $ANTLR start "IF_GE"
    public final void mIF_GE() throws RecognitionException {
        try {
            int _type = IF_GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:257:6: ( 'if-ge' )
            // src/com/riis/decompiler/DexToSourceCasting.g:257:11: 'if-ge'
            {
            match("if-ge"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF_GE"

    // $ANTLR start "SGET_OBJECT"
    public final void mSGET_OBJECT() throws RecognitionException {
        try {
            int _type = SGET_OBJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:258:12: ( 'sget-object' )
            // src/com/riis/decompiler/DexToSourceCasting.g:258:15: 'sget-object'
            {
            match("sget-object"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SGET_OBJECT"

    // $ANTLR start "ADD_INT"
    public final void mADD_INT() throws RecognitionException {
        try {
            int _type = ADD_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:259:8: ( 'add-int/lit8' )
            // src/com/riis/decompiler/DexToSourceCasting.g:259:12: 'add-int/lit8'
            {
            match("add-int/lit8"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADD_INT"

    // $ANTLR start "INT_TO_CHAR"
    public final void mINT_TO_CHAR() throws RecognitionException {
        try {
            int _type = INT_TO_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:260:12: ( 'int-to-char' )
            // src/com/riis/decompiler/DexToSourceCasting.g:260:15: 'int-to-char'
            {
            match("int-to-char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT_TO_CHAR"

    // $ANTLR start "GOTO"
    public final void mGOTO() throws RecognitionException {
        try {
            int _type = GOTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:261:5: ( 'goto' )
            // src/com/riis/decompiler/DexToSourceCasting.g:261:10: 'goto'
            {
            match("goto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GOTO"

    // $ANTLR start "CONST_STRING"
    public final void mCONST_STRING() throws RecognitionException {
        try {
            int _type = CONST_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:262:13: ( 'const-string' )
            // src/com/riis/decompiler/DexToSourceCasting.g:262:16: 'const-string'
            {
            match("const-string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONST_STRING"

    // $ANTLR start "CONST_4"
    public final void mCONST_4() throws RecognitionException {
        try {
            int _type = CONST_4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:263:8: ( 'const/4' )
            // src/com/riis/decompiler/DexToSourceCasting.g:263:12: 'const/4'
            {
            match("const/4"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONST_4"

    // $ANTLR start "CONST_16"
    public final void mCONST_16() throws RecognitionException {
        try {
            int _type = CONST_16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:264:9: ( 'const/16' )
            // src/com/riis/decompiler/DexToSourceCasting.g:264:13: 'const/16'
            {
            match("const/16"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONST_16"

    // $ANTLR start "CONST_HIGH_16"
    public final void mCONST_HIGH_16() throws RecognitionException {
        try {
            int _type = CONST_HIGH_16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:265:14: ( 'const/high16' )
            // src/com/riis/decompiler/DexToSourceCasting.g:265:17: 'const/high16'
            {
            match("const/high16"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONST_HIGH_16"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:266:6: ( ( '0' .. '9' )+ )
            // src/com/riis/decompiler/DexToSourceCasting.g:266:11: ( '0' .. '9' )+
            {
            // src/com/riis/decompiler/DexToSourceCasting.g:266:11: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceCasting.g:
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
    // $ANTLR end "DIGIT"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:267:6: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // src/com/riis/decompiler/DexToSourceCasting.g:267:11: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // src/com/riis/decompiler/DexToSourceCasting.g:267:11: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceCasting.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "LABEL"
    public final void mLABEL() throws RecognitionException {
        try {
            int _type = LABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:268:6: ( 'l' ( '0' .. '9' | 'a' .. 'f' ) ( '0' .. '9' | 'a' .. 'f' ) ( '0' .. '9' | 'a' .. 'f' ) )
            // src/com/riis/decompiler/DexToSourceCasting.g:268:11: 'l' ( '0' .. '9' | 'a' .. 'f' ) ( '0' .. '9' | 'a' .. 'f' ) ( '0' .. '9' | 'a' .. 'f' )
            {
            match('l'); 

            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
    // $ANTLR end "LABEL"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:270:8: ( '//' (~ ( '\\r' | '\\n' ) )* )
            // src/com/riis/decompiler/DexToSourceCasting.g:270:12: '//' (~ ( '\\r' | '\\n' ) )*
            {
            match("//"); 



            // src/com/riis/decompiler/DexToSourceCasting.g:270:17: (~ ( '\\r' | '\\n' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceCasting.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop3;
                }
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/riis/decompiler/DexToSourceCasting.g:271:3: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' | ',' )+ )
            // src/com/riis/decompiler/DexToSourceCasting.g:271:9: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' | ',' )+
            {
            // src/com/riis/decompiler/DexToSourceCasting.g:271:9: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' | ',' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' '||LA4_0==',') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/com/riis/decompiler/DexToSourceCasting.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' '||input.LA(1)==',' ) {
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // src/com/riis/decompiler/DexToSourceCasting.g:1:8: ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | CLASS | PUBLIC | STATIC | FINAL | SUPER | SOURCE | FIELD | METHODSTRT | METHODEND | INIT | LIMIT | REGISTERS | LINE | INVOKE_DIRECT | INVOKE_VIRTUAL | MOVE_RESULT_OBJECT | NEW_INSTANCE | RETURN_VOID | IF_GE | SGET_OBJECT | ADD_INT | INT_TO_CHAR | GOTO | CONST_STRING | CONST_4 | CONST_16 | CONST_HIGH_16 | DIGIT | IDENT | LABEL | COMMENT | WS )
        int alt5=50;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:10: T__36
                {
                mT__36(); 


                }
                break;
            case 2 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:16: T__37
                {
                mT__37(); 


                }
                break;
            case 3 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:22: T__38
                {
                mT__38(); 


                }
                break;
            case 4 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:28: T__39
                {
                mT__39(); 


                }
                break;
            case 5 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:34: T__40
                {
                mT__40(); 


                }
                break;
            case 6 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:40: T__41
                {
                mT__41(); 


                }
                break;
            case 7 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:46: T__42
                {
                mT__42(); 


                }
                break;
            case 8 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:52: T__43
                {
                mT__43(); 


                }
                break;
            case 9 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:58: T__44
                {
                mT__44(); 


                }
                break;
            case 10 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:64: T__45
                {
                mT__45(); 


                }
                break;
            case 11 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:70: T__46
                {
                mT__46(); 


                }
                break;
            case 12 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:76: T__47
                {
                mT__47(); 


                }
                break;
            case 13 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:82: T__48
                {
                mT__48(); 


                }
                break;
            case 14 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:88: T__49
                {
                mT__49(); 


                }
                break;
            case 15 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:94: T__50
                {
                mT__50(); 


                }
                break;
            case 16 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:100: T__51
                {
                mT__51(); 


                }
                break;
            case 17 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:106: T__52
                {
                mT__52(); 


                }
                break;
            case 18 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:112: T__53
                {
                mT__53(); 


                }
                break;
            case 19 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:118: CLASS
                {
                mCLASS(); 


                }
                break;
            case 20 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:124: PUBLIC
                {
                mPUBLIC(); 


                }
                break;
            case 21 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:131: STATIC
                {
                mSTATIC(); 


                }
                break;
            case 22 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:138: FINAL
                {
                mFINAL(); 


                }
                break;
            case 23 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:144: SUPER
                {
                mSUPER(); 


                }
                break;
            case 24 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:150: SOURCE
                {
                mSOURCE(); 


                }
                break;
            case 25 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:157: FIELD
                {
                mFIELD(); 


                }
                break;
            case 26 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:163: METHODSTRT
                {
                mMETHODSTRT(); 


                }
                break;
            case 27 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:174: METHODEND
                {
                mMETHODEND(); 


                }
                break;
            case 28 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:184: INIT
                {
                mINIT(); 


                }
                break;
            case 29 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:189: LIMIT
                {
                mLIMIT(); 


                }
                break;
            case 30 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:195: REGISTERS
                {
                mREGISTERS(); 


                }
                break;
            case 31 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:205: LINE
                {
                mLINE(); 


                }
                break;
            case 32 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:210: INVOKE_DIRECT
                {
                mINVOKE_DIRECT(); 


                }
                break;
            case 33 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:224: INVOKE_VIRTUAL
                {
                mINVOKE_VIRTUAL(); 


                }
                break;
            case 34 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:239: MOVE_RESULT_OBJECT
                {
                mMOVE_RESULT_OBJECT(); 


                }
                break;
            case 35 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:258: NEW_INSTANCE
                {
                mNEW_INSTANCE(); 


                }
                break;
            case 36 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:271: RETURN_VOID
                {
                mRETURN_VOID(); 


                }
                break;
            case 37 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:283: IF_GE
                {
                mIF_GE(); 


                }
                break;
            case 38 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:289: SGET_OBJECT
                {
                mSGET_OBJECT(); 


                }
                break;
            case 39 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:301: ADD_INT
                {
                mADD_INT(); 


                }
                break;
            case 40 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:309: INT_TO_CHAR
                {
                mINT_TO_CHAR(); 


                }
                break;
            case 41 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:321: GOTO
                {
                mGOTO(); 


                }
                break;
            case 42 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:326: CONST_STRING
                {
                mCONST_STRING(); 


                }
                break;
            case 43 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:339: CONST_4
                {
                mCONST_4(); 


                }
                break;
            case 44 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:347: CONST_16
                {
                mCONST_16(); 


                }
                break;
            case 45 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:356: CONST_HIGH_16
                {
                mCONST_HIGH_16(); 


                }
                break;
            case 46 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:370: DIGIT
                {
                mDIGIT(); 


                }
                break;
            case 47 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:376: IDENT
                {
                mIDENT(); 


                }
                break;
            case 48 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:382: LABEL
                {
                mLABEL(); 


                }
                break;
            case 49 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:388: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 50 :
                // src/com/riis/decompiler/DexToSourceCasting.g:1:396: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\4\uffff\1\47\1\51\3\uffff\1\52\1\53\2\uffff\2\36\1\57\2\uffff\2"+
        "\36\1\uffff\7\36\1\uffff\1\36\16\uffff\3\36\1\uffff\14\36\4\uffff"+
        "\12\36\1\uffff\6\36\2\uffff\11\36\1\uffff\1\36\2\uffff\1\155\1\36"+
        "\1\uffff\2\36\1\uffff\1\36\1\uffff\1\162\3\36\2\uffff\2\36\1\171"+
        "\1\172\1\uffff\3\36\2\uffff\1\36\2\uffff\1\36\5\uffff\2\36\2\uffff"+
        "\1\36\1\u0088\2\uffff";
    static final String DFA5_eofS =
        "\u0089\uffff";
    static final String DFA5_minS =
        "\1\11\3\uffff\1\143\1\57\3\uffff\2\101\2\uffff\1\141\1\150\1\101"+
        "\2\uffff\1\147\1\151\1\uffff\1\145\1\146\1\157\1\145\1\144\2\157"+
        "\1\uffff\1\60\4\uffff\1\157\3\uffff\1\151\5\uffff\1\162\1\142\1"+
        "\151\1\uffff\1\141\1\145\1\156\1\147\1\164\1\55\1\166\1\167\1\144"+
        "\1\164\1\156\1\60\3\uffff\1\155\1\141\1\154\1\163\2\164\1\141\1"+
        "\151\1\165\1\157\1\55\1\uffff\1\145\2\55\1\157\1\163\1\60\2\uffff"+
        "\1\155\1\151\1\72\1\151\1\55\1\154\1\163\1\162\1\153\1\uffff\1\55"+
        "\2\uffff\1\101\1\164\1\uffff\1\145\1\143\1\uffff\1\143\1\uffff\1"+
        "\101\1\164\1\156\1\145\2\uffff\1\55\1\164\2\101\1\uffff\1\145\2"+
        "\55\1\uffff\1\61\1\145\2\uffff\1\162\1\uffff\1\144\3\uffff\1\162"+
        "\1\163\2\uffff\1\133\1\101\2\uffff";
    static final String DFA5_maxS =
        "\1\175\3\uffff\1\163\1\57\3\uffff\2\172\2\uffff\1\165\1\150\1\172"+
        "\2\uffff\1\164\1\151\1\uffff\1\145\1\156\1\157\1\145\1\144\2\157"+
        "\1\uffff\1\146\4\uffff\1\165\3\uffff\1\151\5\uffff\1\162\1\142\1"+
        "\151\1\uffff\1\141\1\145\1\156\1\164\1\166\1\55\1\166\1\167\1\144"+
        "\1\164\1\156\1\146\3\uffff\1\156\1\141\1\154\1\163\2\164\1\141\1"+
        "\151\1\165\1\157\1\55\1\uffff\1\145\2\55\1\157\1\163\1\146\2\uffff"+
        "\1\155\1\151\1\72\1\151\1\55\1\154\1\163\1\162\1\153\1\uffff\1\55"+
        "\2\uffff\1\172\1\164\1\uffff\1\145\1\143\1\uffff\1\143\1\uffff\1"+
        "\172\1\164\1\156\1\145\2\uffff\1\57\1\164\2\172\1\uffff\1\145\2"+
        "\55\1\uffff\1\150\1\145\2\uffff\1\162\1\uffff\1\166\3\uffff\1\162"+
        "\1\163\2\uffff\1\133\1\172\2\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\2\uffff\1\7\1\10\1\11\2\uffff\1\14\1\15\3\uffff"+
        "\1\21\1\22\2\uffff\1\34\7\uffff\1\56\1\uffff\1\57\1\62\1\5\1\23"+
        "\1\uffff\1\31\1\32\1\33\1\uffff\1\4\1\61\1\6\1\12\1\13\3\uffff\1"+
        "\20\14\uffff\1\60\1\27\1\30\13\uffff\1\45\6\uffff\1\35\1\37\11\uffff"+
        "\1\50\1\uffff\1\43\1\47\2\uffff\1\57\2\uffff\1\17\1\uffff\1\46\4"+
        "\uffff\1\42\1\51\4\uffff\1\26\3\uffff\1\52\2\uffff\1\24\1\25\1\uffff"+
        "\1\44\1\uffff\1\53\1\54\1\55\2\uffff\1\40\1\41\2\uffff\1\16\1\36";
    static final String DFA5_specialS =
        "\u0089\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\37\1\uffff\2\37\22\uffff\1\37\1\uffff\1\1\5\uffff\1\2\1\3"+
            "\2\uffff\1\37\1\uffff\1\4\1\5\12\34\1\6\1\7\1\24\1\10\3\uffff"+
            "\13\36\1\11\11\36\1\12\4\36\1\13\1\uffff\1\14\3\uffff\1\31\1"+
            "\36\1\33\2\36\1\23\1\32\1\36\1\26\2\36\1\35\1\27\1\30\1\36\1"+
            "\15\1\36\1\25\1\22\1\16\1\36\1\17\4\36\1\20\1\uffff\1\21",
            "",
            "",
            "",
            "\1\41\1\uffff\1\45\1\43\3\uffff\1\40\1\uffff\1\46\1\44\5\uffff"+
            "\1\42",
            "\1\50",
            "",
            "",
            "",
            "\32\36\6\uffff\32\36",
            "\32\36\6\uffff\32\36",
            "",
            "",
            "\1\54\23\uffff\1\55",
            "\1\56",
            "\32\36\6\uffff\32\36",
            "",
            "",
            "\1\61\14\uffff\1\60",
            "\1\62",
            "",
            "\1\63",
            "\1\65\7\uffff\1\64",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "\12\74\47\uffff\6\73",
            "",
            "",
            "",
            "",
            "\1\76\5\uffff\1\75",
            "",
            "",
            "",
            "\1\77",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106\14\uffff\1\107",
            "\1\111\1\uffff\1\110",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\74\47\uffff\6\120",
            "",
            "",
            "",
            "\1\121\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\74\47\uffff\6\142",
            "",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "",
            "",
            "\32\36\6\uffff\32\36",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "",
            "\32\36\6\uffff\32\36",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "",
            "\1\166\1\uffff\1\167",
            "\1\170",
            "\32\36\6\uffff\32\36",
            "\32\36\6\uffff\32\36",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "\1\177\2\uffff\1\176\63\uffff\1\u0080",
            "\1\u0081",
            "",
            "",
            "\1\u0082",
            "",
            "\1\u0083\21\uffff\1\u0084",
            "",
            "",
            "",
            "\1\u0085",
            "\1\u0086",
            "",
            "",
            "\1\u0087",
            "\32\36\6\uffff\32\36",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | CLASS | PUBLIC | STATIC | FINAL | SUPER | SOURCE | FIELD | METHODSTRT | METHODEND | INIT | LIMIT | REGISTERS | LINE | INVOKE_DIRECT | INVOKE_VIRTUAL | MOVE_RESULT_OBJECT | NEW_INSTANCE | RETURN_VOID | IF_GE | SGET_OBJECT | ADD_INT | INT_TO_CHAR | GOTO | CONST_STRING | CONST_4 | CONST_16 | CONST_HIGH_16 | DIGIT | IDENT | LABEL | COMMENT | WS );";
        }
    }
 

}