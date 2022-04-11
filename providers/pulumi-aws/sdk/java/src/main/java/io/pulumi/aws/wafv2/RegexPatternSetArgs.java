// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2;

import io.pulumi.aws.wafv2.inputs.RegexPatternSetRegularExpressionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegexPatternSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegexPatternSetArgs Empty = new RegexPatternSetArgs();

    /**
     * A friendly description of the regular expression pattern set.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A friendly name of the regular expression pattern set.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * One or more blocks of regular expression patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`. See Regular Expression below for details.
     * 
     */
    @Import(name="regularExpressions")
      private final @Nullable Output<List<RegexPatternSetRegularExpressionArgs>> regularExpressions;

    public Output<List<RegexPatternSetRegularExpressionArgs>> getRegularExpressions() {
        return this.regularExpressions == null ? Codegen.empty() : this.regularExpressions;
    }

    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> getScope() {
        return this.scope;
    }

    /**
     * An array of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public RegexPatternSetArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<List<RegexPatternSetRegularExpressionArgs>> regularExpressions,
        Output<String> scope,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.name = name;
        this.regularExpressions = regularExpressions;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.tags = tags;
    }

    private RegexPatternSetArgs() {
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.regularExpressions = Codegen.empty();
        this.scope = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegexPatternSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<List<RegexPatternSetRegularExpressionArgs>> regularExpressions;
        private Output<String> scope;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RegexPatternSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.regularExpressions = defaults.regularExpressions;
    	      this.scope = defaults.scope;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder regularExpressions(@Nullable Output<List<RegexPatternSetRegularExpressionArgs>> regularExpressions) {
            this.regularExpressions = regularExpressions;
            return this;
        }
        public Builder regularExpressions(@Nullable List<RegexPatternSetRegularExpressionArgs> regularExpressions) {
            this.regularExpressions = Codegen.ofNullable(regularExpressions);
            return this;
        }
        public Builder regularExpressions(RegexPatternSetRegularExpressionArgs... regularExpressions) {
            return regularExpressions(List.of(regularExpressions));
        }
        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public RegexPatternSetArgs build() {
            return new RegexPatternSetArgs(description, name, regularExpressions, scope, tags);
        }
    }
}
