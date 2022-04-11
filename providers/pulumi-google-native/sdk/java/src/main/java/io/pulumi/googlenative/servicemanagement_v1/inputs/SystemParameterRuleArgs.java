// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.servicemanagement_v1.inputs.SystemParameterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Define a system parameter rule mapping system parameter definitions to methods.
 * 
 */
public final class SystemParameterRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SystemParameterRuleArgs Empty = new SystemParameterRuleArgs();

    /**
     * Define parameters. Multiple names may be defined for a parameter. For a given method call, only one of them should be used. If multiple names are used the behavior is implementation-dependent. If none of the specified names are present the behavior is parameter-dependent.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<SystemParameterArgs>> parameters;

    public Output<List<SystemParameterArgs>> getParameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * Selects the methods to which this rule applies. Use '*' to indicate all methods in all APIs. Refer to selector for syntax details.
     * 
     */
    @Import(name="selector")
      private final @Nullable Output<String> selector;

    public Output<String> getSelector() {
        return this.selector == null ? Codegen.empty() : this.selector;
    }

    public SystemParameterRuleArgs(
        @Nullable Output<List<SystemParameterArgs>> parameters,
        @Nullable Output<String> selector) {
        this.parameters = parameters;
        this.selector = selector;
    }

    private SystemParameterRuleArgs() {
        this.parameters = Codegen.empty();
        this.selector = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemParameterRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<SystemParameterArgs>> parameters;
        private @Nullable Output<String> selector;

        public Builder() {
    	      // Empty
        }

        public Builder(SystemParameterRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.selector = defaults.selector;
        }

        public Builder parameters(@Nullable Output<List<SystemParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable List<SystemParameterArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder parameters(SystemParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder selector(@Nullable Output<String> selector) {
            this.selector = selector;
            return this;
        }
        public Builder selector(@Nullable String selector) {
            this.selector = Codegen.ofNullable(selector);
            return this;
        }        public SystemParameterRuleArgs build() {
            return new SystemParameterRuleArgs(parameters, selector);
        }
    }
}
