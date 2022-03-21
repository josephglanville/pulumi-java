// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.core_v1.inputs.NamespaceConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NamespaceStatus is information about the current status of a Namespace.
 * 
 */
public final class NamespaceStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final NamespaceStatusArgs Empty = new NamespaceStatusArgs();

    /**
     * Represents the latest available observations of a namespace's current state.
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<NamespaceConditionArgs>> conditions;

    public Output<List<NamespaceConditionArgs>> getConditions() {
        return this.conditions == null ? Output.empty() : this.conditions;
    }

    /**
     * Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
     * 
     * Possible enum values:
     *  - `"Active"` means the namespace is available for use in the system
     *  - `"Terminating"` means the namespace is undergoing graceful termination
     * 
     */
    @Import(name="phase")
      private final @Nullable Output<String> phase;

    public Output<String> getPhase() {
        return this.phase == null ? Output.empty() : this.phase;
    }

    public NamespaceStatusArgs(
        @Nullable Output<List<NamespaceConditionArgs>> conditions,
        @Nullable Output<String> phase) {
        this.conditions = conditions;
        this.phase = phase;
    }

    private NamespaceStatusArgs() {
        this.conditions = Output.empty();
        this.phase = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<NamespaceConditionArgs>> conditions;
        private @Nullable Output<String> phase;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespaceStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.phase = defaults.phase;
        }

        public Builder conditions(@Nullable Output<List<NamespaceConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<NamespaceConditionArgs> conditions) {
            this.conditions = Output.ofNullable(conditions);
            return this;
        }
        public Builder conditions(NamespaceConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder phase(@Nullable Output<String> phase) {
            this.phase = phase;
            return this;
        }
        public Builder phase(@Nullable String phase) {
            this.phase = Output.ofNullable(phase);
            return this;
        }        public NamespaceStatusArgs build() {
            return new NamespaceStatusArgs(conditions, phase);
        }
    }
}
