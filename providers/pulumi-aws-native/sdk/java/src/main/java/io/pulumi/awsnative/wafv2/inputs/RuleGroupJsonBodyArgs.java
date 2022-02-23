// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupBodyParsingFallbackBehavior;
import io.pulumi.awsnative.wafv2.enums.RuleGroupJsonMatchScope;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupJsonMatchPatternArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Inspect the request body as JSON. The request body immediately follows the request headers.
 * 
 */
public final class RuleGroupJsonBodyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupJsonBodyArgs Empty = new RuleGroupJsonBodyArgs();

    @InputImport(name="invalidFallbackBehavior")
      private final @Nullable Input<RuleGroupBodyParsingFallbackBehavior> invalidFallbackBehavior;

    public Input<RuleGroupBodyParsingFallbackBehavior> getInvalidFallbackBehavior() {
        return this.invalidFallbackBehavior == null ? Input.empty() : this.invalidFallbackBehavior;
    }

    @InputImport(name="matchPattern", required=true)
      private final Input<RuleGroupJsonMatchPatternArgs> matchPattern;

    public Input<RuleGroupJsonMatchPatternArgs> getMatchPattern() {
        return this.matchPattern;
    }

    @InputImport(name="matchScope", required=true)
      private final Input<RuleGroupJsonMatchScope> matchScope;

    public Input<RuleGroupJsonMatchScope> getMatchScope() {
        return this.matchScope;
    }

    public RuleGroupJsonBodyArgs(
        @Nullable Input<RuleGroupBodyParsingFallbackBehavior> invalidFallbackBehavior,
        Input<RuleGroupJsonMatchPatternArgs> matchPattern,
        Input<RuleGroupJsonMatchScope> matchScope) {
        this.invalidFallbackBehavior = invalidFallbackBehavior;
        this.matchPattern = Objects.requireNonNull(matchPattern, "expected parameter 'matchPattern' to be non-null");
        this.matchScope = Objects.requireNonNull(matchScope, "expected parameter 'matchScope' to be non-null");
    }

    private RuleGroupJsonBodyArgs() {
        this.invalidFallbackBehavior = Input.empty();
        this.matchPattern = Input.empty();
        this.matchScope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupJsonBodyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleGroupBodyParsingFallbackBehavior> invalidFallbackBehavior;
        private Input<RuleGroupJsonMatchPatternArgs> matchPattern;
        private Input<RuleGroupJsonMatchScope> matchScope;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupJsonBodyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invalidFallbackBehavior = defaults.invalidFallbackBehavior;
    	      this.matchPattern = defaults.matchPattern;
    	      this.matchScope = defaults.matchScope;
        }

        public Builder setInvalidFallbackBehavior(@Nullable Input<RuleGroupBodyParsingFallbackBehavior> invalidFallbackBehavior) {
            this.invalidFallbackBehavior = invalidFallbackBehavior;
            return this;
        }

        public Builder setInvalidFallbackBehavior(@Nullable RuleGroupBodyParsingFallbackBehavior invalidFallbackBehavior) {
            this.invalidFallbackBehavior = Input.ofNullable(invalidFallbackBehavior);
            return this;
        }

        public Builder setMatchPattern(Input<RuleGroupJsonMatchPatternArgs> matchPattern) {
            this.matchPattern = Objects.requireNonNull(matchPattern);
            return this;
        }

        public Builder setMatchPattern(RuleGroupJsonMatchPatternArgs matchPattern) {
            this.matchPattern = Input.of(Objects.requireNonNull(matchPattern));
            return this;
        }

        public Builder setMatchScope(Input<RuleGroupJsonMatchScope> matchScope) {
            this.matchScope = Objects.requireNonNull(matchScope);
            return this;
        }

        public Builder setMatchScope(RuleGroupJsonMatchScope matchScope) {
            this.matchScope = Input.of(Objects.requireNonNull(matchScope));
            return this;
        }
        public RuleGroupJsonBodyArgs build() {
            return new RuleGroupJsonBodyArgs(invalidFallbackBehavior, matchPattern, matchScope);
        }
    }
}
