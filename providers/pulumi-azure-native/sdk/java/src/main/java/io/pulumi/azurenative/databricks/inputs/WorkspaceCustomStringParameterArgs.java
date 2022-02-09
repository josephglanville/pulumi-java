// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WorkspaceCustomStringParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceCustomStringParameterArgs Empty = new WorkspaceCustomStringParameterArgs();

    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public WorkspaceCustomStringParameterArgs(Input<String> value) {
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private WorkspaceCustomStringParameterArgs() {
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceCustomStringParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceCustomStringParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public WorkspaceCustomStringParameterArgs build() {
            return new WorkspaceCustomStringParameterArgs(value);
        }
    }
}
