// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Managed application locking policy.
 * 
 */
public final class ApplicationPackageLockingPolicyDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationPackageLockingPolicyDefinitionArgs Empty = new ApplicationPackageLockingPolicyDefinitionArgs();

    /**
     * The deny assignment excluded actions.
     * 
     */
    @Import(name="allowedActions")
      private final @Nullable Output<List<String>> allowedActions;

    public Output<List<String>> getAllowedActions() {
        return this.allowedActions == null ? Codegen.empty() : this.allowedActions;
    }

    /**
     * The deny assignment excluded data actions.
     * 
     */
    @Import(name="allowedDataActions")
      private final @Nullable Output<List<String>> allowedDataActions;

    public Output<List<String>> getAllowedDataActions() {
        return this.allowedDataActions == null ? Codegen.empty() : this.allowedDataActions;
    }

    public ApplicationPackageLockingPolicyDefinitionArgs(
        @Nullable Output<List<String>> allowedActions,
        @Nullable Output<List<String>> allowedDataActions) {
        this.allowedActions = allowedActions;
        this.allowedDataActions = allowedDataActions;
    }

    private ApplicationPackageLockingPolicyDefinitionArgs() {
        this.allowedActions = Codegen.empty();
        this.allowedDataActions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationPackageLockingPolicyDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedActions;
        private @Nullable Output<List<String>> allowedDataActions;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationPackageLockingPolicyDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedActions = defaults.allowedActions;
    	      this.allowedDataActions = defaults.allowedDataActions;
        }

        public Builder allowedActions(@Nullable Output<List<String>> allowedActions) {
            this.allowedActions = allowedActions;
            return this;
        }
        public Builder allowedActions(@Nullable List<String> allowedActions) {
            this.allowedActions = Codegen.ofNullable(allowedActions);
            return this;
        }
        public Builder allowedActions(String... allowedActions) {
            return allowedActions(List.of(allowedActions));
        }
        public Builder allowedDataActions(@Nullable Output<List<String>> allowedDataActions) {
            this.allowedDataActions = allowedDataActions;
            return this;
        }
        public Builder allowedDataActions(@Nullable List<String> allowedDataActions) {
            this.allowedDataActions = Codegen.ofNullable(allowedDataActions);
            return this;
        }
        public Builder allowedDataActions(String... allowedDataActions) {
            return allowedDataActions(List.of(allowedDataActions));
        }        public ApplicationPackageLockingPolicyDefinitionArgs build() {
            return new ApplicationPackageLockingPolicyDefinitionArgs(allowedActions, allowedDataActions);
        }
    }
}
