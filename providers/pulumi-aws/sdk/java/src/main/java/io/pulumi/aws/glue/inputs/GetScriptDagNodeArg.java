// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetScriptDagNodeArg extends io.pulumi.resources.InvokeArgs {

    public static final GetScriptDagNodeArg Empty = new GetScriptDagNodeArg();

    /**
     * The name of the argument or property.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Boolean if the value is used as a parameter. Defaults to `false`.
     * 
     */
    @Import(name="param")
      private final @Nullable Boolean param;

    public Optional<Boolean> getParam() {
        return this.param == null ? Optional.empty() : Optional.ofNullable(this.param);
    }

    /**
     * The value of the argument or property.
     * 
     */
    @Import(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public GetScriptDagNodeArg(
        String name,
        @Nullable Boolean param,
        String value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.param = param;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private GetScriptDagNodeArg() {
        this.name = null;
        this.param = null;
        this.value = null;
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