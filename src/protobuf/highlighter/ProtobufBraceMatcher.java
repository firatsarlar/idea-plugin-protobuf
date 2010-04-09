package protobuf.highlighting;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import protobuf.lang.ProtobufTokenTypes;

/**
 * author: Nikolay Matveev
 * Date: Mar 6, 2010
 */
public class ProtobufBraceMatcher implements PairedBraceMatcher {

    //todo [low] what is true and what is false
    private static final BracePair[] PAIRS = {
        new BracePair(ProtobufTokenTypes.OPEN_BRACE,ProtobufTokenTypes.CLOSE_BRACE,false),
        new BracePair(ProtobufTokenTypes.OPEN_BLOCK, ProtobufTokenTypes.CLOSE_BLOCK,false),
        new BracePair(ProtobufTokenTypes.OPEN_PARANT,ProtobufTokenTypes.CLOSE_PARANT,false)
    };


    public BracePair[] getPairs() {
        return PAIRS;
    }

    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType iElementType, @Nullable IElementType iElementType1) {
        return true;
    }

    public int getCodeConstructStart(PsiFile psiFile, int i) {
        return i;
    }
}
