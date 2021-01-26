import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;

public class Evaluator {
    CharStream XPathCharStream = CharStreams.fromString("doc(“j_caesar.xml”)//PERSONA");
    XPathLexer lexer = new XPathLexer(XPathCharStream);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    XPathParser parser = new XPathParser(tokens);
    ParseTree tree = parser.absolutePath();

}

