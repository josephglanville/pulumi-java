// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.WebACLPositionalConstraint;
import io.pulumi.awsnative.wafv2.inputs.WebACLFieldToMatchArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLTextTransformationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Byte Match statement.
 * 
 */
public final class WebACLByteMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLByteMatchStatementArgs Empty = new WebACLByteMatchStatementArgs();

    @Import(name="fieldToMatch", required=true)
      private final Output<WebACLFieldToMatchArgs> fieldToMatch;

    public Output<WebACLFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch;
    }

    @Import(name="positionalConstraint", required=true)
      private final Output<WebACLPositionalConstraint> positionalConstraint;

    public Output<WebACLPositionalConstraint> getPositionalConstraint() {
        return this.positionalConstraint;
    }

    @Import(name="searchString")
      private final @Nullable Output<String> searchString;

    public Output<String> getSearchString() {
        return this.searchString == null ? Codegen.empty() : this.searchString;
    }

    @Import(name="searchStringBase64")
      private final @Nullable Output<String> searchStringBase64;

    public Output<String> getSearchStringBase64() {
        return this.searchStringBase64 == null ? Codegen.empty() : this.searchStringBase64;
    }

    @Import(name="textTransformations", required=true)
      private final Output<List<WebACLTextTransformationArgs>> textTransformations;

    public Output<List<WebACLTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebACLByteMatchStatementArgs(
        Output<WebACLFieldToMatchArgs> fieldToMatch,
        Output<WebACLPositionalConstraint> positionalConstraint,
        @Nullable Output<String> searchString,
        @Nullable Output<String> searchStringBase64,
        Output<List<WebACLTextTransformationArgs>> textTransformations) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.positionalConstraint = Objects.requireNonNull(positionalConstraint, "expected parameter 'positionalConstraint' to be non-null");
        this.searchString = searchString;
        this.searchStringBase64 = searchStringBase64;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebACLByteMatchStatementArgs() {
        this.fieldToMatch = Codegen.empty();
        this.positionalConstraint = Codegen.empty();
        this.searchString = Codegen.empty();
        this.searchStringBase64 = Codegen.empty();
        this.textTransformations = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLByteMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<WebACLFieldToMatchArgs> fieldToMatch;
        private Output<WebACLPositionalConstraint> positionalConstraint;
        private @Nullable Output<String> searchString;
        private @Nullable Output<String> searchStringBase64;
        private Output<List<WebACLTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLByteMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.positionalConstraint = defaults.positionalConstraint;
    	      this.searchString = defaults.searchString;
    	      this.searchStringBase64 = defaults.searchStringBase64;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(Output<WebACLFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }
        public Builder fieldToMatch(WebACLFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Output.of(Objects.requireNonNull(fieldToMatch));
            return this;
        }
        public Builder positionalConstraint(Output<WebACLPositionalConstraint> positionalConstraint) {
            this.positionalConstraint = Objects.requireNonNull(positionalConstraint);
            return this;
        }
        public Builder positionalConstraint(WebACLPositionalConstraint positionalConstraint) {
            this.positionalConstraint = Output.of(Objects.requireNonNull(positionalConstraint));
            return this;
        }
        public Builder searchString(@Nullable Output<String> searchString) {
            this.searchString = searchString;
            return this;
        }
        public Builder searchString(@Nullable String searchString) {
            this.searchString = Codegen.ofNullable(searchString);
            return this;
        }
        public Builder searchStringBase64(@Nullable Output<String> searchStringBase64) {
            this.searchStringBase64 = searchStringBase64;
            return this;
        }
        public Builder searchStringBase64(@Nullable String searchStringBase64) {
            this.searchStringBase64 = Codegen.ofNullable(searchStringBase64);
            return this;
        }
        public Builder textTransformations(Output<List<WebACLTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(List<WebACLTextTransformationArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public Builder textTransformations(WebACLTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebACLByteMatchStatementArgs build() {
            return new WebACLByteMatchStatementArgs(fieldToMatch, positionalConstraint, searchString, searchStringBase64, textTransformations);
        }
    }
}
