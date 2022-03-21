// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.WebApplicationFirewallMatchVariable;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Define match variables.
 * 
 */
public final class MatchVariableArgs extends io.pulumi.resources.ResourceArgs {

    public static final MatchVariableArgs Empty = new MatchVariableArgs();

    /**
     * The selector of match variable.
     * 
     */
    @Import(name="selector")
      private final @Nullable Output<String> selector;

    public Output<String> getSelector() {
        return this.selector == null ? Output.empty() : this.selector;
    }

    /**
     * Match Variable.
     * 
     */
    @Import(name="variableName", required=true)
      private final Output<Either<String,WebApplicationFirewallMatchVariable>> variableName;

    public Output<Either<String,WebApplicationFirewallMatchVariable>> getVariableName() {
        return this.variableName;
    }

    public MatchVariableArgs(
        @Nullable Output<String> selector,
        Output<Either<String,WebApplicationFirewallMatchVariable>> variableName) {
        this.selector = selector;
        this.variableName = Objects.requireNonNull(variableName, "expected parameter 'variableName' to be non-null");
    }

    private MatchVariableArgs() {
        this.selector = Output.empty();
        this.variableName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MatchVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> selector;
        private Output<Either<String,WebApplicationFirewallMatchVariable>> variableName;

        public Builder() {
    	      // Empty
        }

        public Builder(MatchVariableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selector = defaults.selector;
    	      this.variableName = defaults.variableName;
        }

        public Builder selector(@Nullable Output<String> selector) {
            this.selector = selector;
            return this;
        }
        public Builder selector(@Nullable String selector) {
            this.selector = Output.ofNullable(selector);
            return this;
        }
        public Builder variableName(Output<Either<String,WebApplicationFirewallMatchVariable>> variableName) {
            this.variableName = Objects.requireNonNull(variableName);
            return this;
        }
        public Builder variableName(Either<String,WebApplicationFirewallMatchVariable> variableName) {
            this.variableName = Output.of(Objects.requireNonNull(variableName));
            return this;
        }        public MatchVariableArgs build() {
            return new MatchVariableArgs(selector, variableName);
        }
    }
}
