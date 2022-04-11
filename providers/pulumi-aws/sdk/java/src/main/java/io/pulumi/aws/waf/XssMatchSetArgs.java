// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf;

import io.pulumi.aws.waf.inputs.XssMatchSetXssMatchTupleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class XssMatchSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final XssMatchSetArgs Empty = new XssMatchSetArgs();

    /**
     * The name or description of the SizeConstraintSet.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The parts of web requests that you want to inspect for cross-site scripting attacks.
     * 
     */
    @Import(name="xssMatchTuples")
      private final @Nullable Output<List<XssMatchSetXssMatchTupleArgs>> xssMatchTuples;

    public Output<List<XssMatchSetXssMatchTupleArgs>> getXssMatchTuples() {
        return this.xssMatchTuples == null ? Codegen.empty() : this.xssMatchTuples;
    }

    public XssMatchSetArgs(
        @Nullable Output<String> name,
        @Nullable Output<List<XssMatchSetXssMatchTupleArgs>> xssMatchTuples) {
        this.name = name;
        this.xssMatchTuples = xssMatchTuples;
    }

    private XssMatchSetArgs() {
        this.name = Codegen.empty();
        this.xssMatchTuples = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(XssMatchSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<List<XssMatchSetXssMatchTupleArgs>> xssMatchTuples;

        public Builder() {
    	      // Empty
        }

        public Builder(XssMatchSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.xssMatchTuples = defaults.xssMatchTuples;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder xssMatchTuples(@Nullable Output<List<XssMatchSetXssMatchTupleArgs>> xssMatchTuples) {
            this.xssMatchTuples = xssMatchTuples;
            return this;
        }
        public Builder xssMatchTuples(@Nullable List<XssMatchSetXssMatchTupleArgs> xssMatchTuples) {
            this.xssMatchTuples = Codegen.ofNullable(xssMatchTuples);
            return this;
        }
        public Builder xssMatchTuples(XssMatchSetXssMatchTupleArgs... xssMatchTuples) {
            return xssMatchTuples(List.of(xssMatchTuples));
        }        public XssMatchSetArgs build() {
            return new XssMatchSetArgs(name, xssMatchTuples);
        }
    }
}
