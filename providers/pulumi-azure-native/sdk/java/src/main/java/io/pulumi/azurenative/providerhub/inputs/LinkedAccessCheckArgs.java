// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LinkedAccessCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkedAccessCheckArgs Empty = new LinkedAccessCheckArgs();

    @Import(name="actionName")
      private final @Nullable Output<String> actionName;

    public Output<String> getActionName() {
        return this.actionName == null ? Output.empty() : this.actionName;
    }

    @Import(name="linkedAction")
      private final @Nullable Output<String> linkedAction;

    public Output<String> getLinkedAction() {
        return this.linkedAction == null ? Output.empty() : this.linkedAction;
    }

    @Import(name="linkedActionVerb")
      private final @Nullable Output<String> linkedActionVerb;

    public Output<String> getLinkedActionVerb() {
        return this.linkedActionVerb == null ? Output.empty() : this.linkedActionVerb;
    }

    @Import(name="linkedProperty")
      private final @Nullable Output<String> linkedProperty;

    public Output<String> getLinkedProperty() {
        return this.linkedProperty == null ? Output.empty() : this.linkedProperty;
    }

    @Import(name="linkedType")
      private final @Nullable Output<String> linkedType;

    public Output<String> getLinkedType() {
        return this.linkedType == null ? Output.empty() : this.linkedType;
    }

    public LinkedAccessCheckArgs(
        @Nullable Output<String> actionName,
        @Nullable Output<String> linkedAction,
        @Nullable Output<String> linkedActionVerb,
        @Nullable Output<String> linkedProperty,
        @Nullable Output<String> linkedType) {
        this.actionName = actionName;
        this.linkedAction = linkedAction;
        this.linkedActionVerb = linkedActionVerb;
        this.linkedProperty = linkedProperty;
        this.linkedType = linkedType;
    }

    private LinkedAccessCheckArgs() {
        this.actionName = Output.empty();
        this.linkedAction = Output.empty();
        this.linkedActionVerb = Output.empty();
        this.linkedProperty = Output.empty();
        this.linkedType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedAccessCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> actionName;
        private @Nullable Output<String> linkedAction;
        private @Nullable Output<String> linkedActionVerb;
        private @Nullable Output<String> linkedProperty;
        private @Nullable Output<String> linkedType;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedAccessCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionName = defaults.actionName;
    	      this.linkedAction = defaults.linkedAction;
    	      this.linkedActionVerb = defaults.linkedActionVerb;
    	      this.linkedProperty = defaults.linkedProperty;
    	      this.linkedType = defaults.linkedType;
        }

        public Builder actionName(@Nullable Output<String> actionName) {
            this.actionName = actionName;
            return this;
        }
        public Builder actionName(@Nullable String actionName) {
            this.actionName = Output.ofNullable(actionName);
            return this;
        }
        public Builder linkedAction(@Nullable Output<String> linkedAction) {
            this.linkedAction = linkedAction;
            return this;
        }
        public Builder linkedAction(@Nullable String linkedAction) {
            this.linkedAction = Output.ofNullable(linkedAction);
            return this;
        }
        public Builder linkedActionVerb(@Nullable Output<String> linkedActionVerb) {
            this.linkedActionVerb = linkedActionVerb;
            return this;
        }
        public Builder linkedActionVerb(@Nullable String linkedActionVerb) {
            this.linkedActionVerb = Output.ofNullable(linkedActionVerb);
            return this;
        }
        public Builder linkedProperty(@Nullable Output<String> linkedProperty) {
            this.linkedProperty = linkedProperty;
            return this;
        }
        public Builder linkedProperty(@Nullable String linkedProperty) {
            this.linkedProperty = Output.ofNullable(linkedProperty);
            return this;
        }
        public Builder linkedType(@Nullable Output<String> linkedType) {
            this.linkedType = linkedType;
            return this;
        }
        public Builder linkedType(@Nullable String linkedType) {
            this.linkedType = Output.ofNullable(linkedType);
            return this;
        }        public LinkedAccessCheckArgs build() {
            return new LinkedAccessCheckArgs(actionName, linkedAction, linkedActionVerb, linkedProperty, linkedType);
        }
    }
}
