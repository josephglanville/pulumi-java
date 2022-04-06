// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetScriptDagNodeArg {
    /**
     * The name of the argument or property.
     * 
     */
    private final String name;
    /**
     * Boolean if the value is used as a parameter. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean param;
    /**
     * The value of the argument or property.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GetScriptDagNodeArg(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("param") @Nullable Boolean param,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.param = param;
        this.value = value;
    }

    /**
     * The name of the argument or property.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Boolean if the value is used as a parameter. Defaults to `false`.
     * 
    */
    public Optional<Boolean> getParam() {
        return Optional.ofNullable(this.param);
    }
    /**
     * The value of the argument or property.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScriptDagNodeArg defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable Boolean param;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScriptDagNodeArg defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.param = defaults.param;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder param(@Nullable Boolean param) {
            this.param = param;
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetScriptDagNodeArg build() {
            return new GetScriptDagNodeArg(name, param, value);
        }
    }
}