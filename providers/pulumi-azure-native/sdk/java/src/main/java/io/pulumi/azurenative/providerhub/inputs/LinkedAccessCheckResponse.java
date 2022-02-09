// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinkedAccessCheckResponse extends io.pulumi.resources.InvokeArgs {

    public static final LinkedAccessCheckResponse Empty = new LinkedAccessCheckResponse();

    @InputImport(name="actionName")
    private final @Nullable String actionName;

    public Optional<String> getActionName() {
        return this.actionName == null ? Optional.empty() : Optional.ofNullable(this.actionName);
    }

    @InputImport(name="linkedAction")
    private final @Nullable String linkedAction;

    public Optional<String> getLinkedAction() {
        return this.linkedAction == null ? Optional.empty() : Optional.ofNullable(this.linkedAction);
    }

    @InputImport(name="linkedActionVerb")
    private final @Nullable String linkedActionVerb;

    public Optional<String> getLinkedActionVerb() {
        return this.linkedActionVerb == null ? Optional.empty() : Optional.ofNullable(this.linkedActionVerb);
    }

    @InputImport(name="linkedProperty")
    private final @Nullable String linkedProperty;

    public Optional<String> getLinkedProperty() {
        return this.linkedProperty == null ? Optional.empty() : Optional.ofNullable(this.linkedProperty);
    }

    @InputImport(name="linkedType")
    private final @Nullable String linkedType;

    public Optional<String> getLinkedType() {
        return this.linkedType == null ? Optional.empty() : Optional.ofNullable(this.linkedType);
    }

    public LinkedAccessCheckResponse(
        @Nullable String actionName,
        @Nullable String linkedAction,
        @Nullable String linkedActionVerb,
        @Nullable String linkedProperty,
        @Nullable String linkedType) {
        this.actionName = actionName;
        this.linkedAction = linkedAction;
        this.linkedActionVerb = linkedActionVerb;
        this.linkedProperty = linkedProperty;
        this.linkedType = linkedType;
    }

    private LinkedAccessCheckResponse() {
        this.actionName = null;
        this.linkedAction = null;
        this.linkedActionVerb = null;
        this.linkedProperty = null;
        this.linkedType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedAccessCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionName;
        private @Nullable String linkedAction;
        private @Nullable String linkedActionVerb;
        private @Nullable String linkedProperty;
        private @Nullable String linkedType;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedAccessCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionName = defaults.actionName;
    	      this.linkedAction = defaults.linkedAction;
    	      this.linkedActionVerb = defaults.linkedActionVerb;
    	      this.linkedProperty = defaults.linkedProperty;
    	      this.linkedType = defaults.linkedType;
        }

        public Builder setActionName(@Nullable String actionName) {
            this.actionName = actionName;
            return this;
        }

        public Builder setLinkedAction(@Nullable String linkedAction) {
            this.linkedAction = linkedAction;
            return this;
        }

        public Builder setLinkedActionVerb(@Nullable String linkedActionVerb) {
            this.linkedActionVerb = linkedActionVerb;
            return this;
        }

        public Builder setLinkedProperty(@Nullable String linkedProperty) {
            this.linkedProperty = linkedProperty;
            return this;
        }

        public Builder setLinkedType(@Nullable String linkedType) {
            this.linkedType = linkedType;
            return this;
        }

        public LinkedAccessCheckResponse build() {
            return new LinkedAccessCheckResponse(actionName, linkedAction, linkedActionVerb, linkedProperty, linkedType);
        }
    }
}
