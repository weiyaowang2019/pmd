/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.scala.ast;

import scala.meta.Term;

/**
 * The ASTTermApplyInfix node implementation.
 */
public class ASTTermApplyInfix extends AbstractScalaNode<Term.ApplyInfix> {

    /**
     * Create the AST node for this Scala node.
     *
     * @param scalaNode
     *            the underlying Scala node
     */
    public ASTTermApplyInfix(Term.ApplyInfix scalaNode) {
        super(scalaNode);
    }

    @Override
    public <D, R> R accept(ScalaParserVisitor<D, R> visitor, D data) {
        return visitor.visit(this, data);
    }
}
