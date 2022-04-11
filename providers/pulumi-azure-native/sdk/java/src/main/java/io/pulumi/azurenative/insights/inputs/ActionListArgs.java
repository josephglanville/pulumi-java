// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.ActionGroupArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A list of Activity Log Alert rule actions.
 * 
 */
public final class ActionListArgs extends io.pulumi.resources.ResourceArgs {

    public static final ActionListArgs Empty = new ActionListArgs();

    /**
     * The list of the Action Groups.
     * 
     */
    @Import(name="actionGroups")
      private final @Nullable Output<List<ActionGroupArgs>> actionGroups;

    public Output<List<ActionGroupArgs>> getActionGroups() {
        return this.actionGroups == null ? Codegen.empty() : this.actionGroups;
    }

    public ActionListArgs(@Nullable Output<List<ActionGroupArgs>> actionGroups) {
        this.actionGroups = actionGroups;
    }

    private ActionListArgs() {
        this.actionGroups = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ActionGroupArgs>> actionGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroups = defaults.actionGroups;
        }

        public Builder actionGroups(@Nullable Output<List<ActionGroupArgs>> actionGroups) {
            this.actionGroups = actionGroups;
            return this;
        }
        public Builder actionGroups(@Nullable List<ActionGroupArgs> actionGroups) {
            this.actionGroups = Codegen.ofNullable(actionGroups);
            return this;
        }
        public Builder actionGroups(ActionGroupArgs... actionGroups) {
            return actionGroups(List.of(actionGroups));
        }        public ActionListArgs build() {
            return new ActionListArgs(actionGroups);
        }
    }
}
