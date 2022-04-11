// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationRecipientEmailArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationRecipientEmailArgs Empty = new NotificationRecipientEmailArgs();

    /**
     * Email identifier.
     * 
     */
    @Import(name="email")
      private final @Nullable Output<String> email;

    public Output<String> getEmail() {
        return this.email == null ? Codegen.empty() : this.email;
    }

    /**
     * Notification Name Identifier.
     * 
     */
    @Import(name="notificationName", required=true)
      private final Output<String> notificationName;

    public Output<String> getNotificationName() {
        return this.notificationName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }

    public NotificationRecipientEmailArgs(
        @Nullable Output<String> email,
        Output<String> notificationName,
        Output<String> resourceGroupName,
        Output<String> serviceName) {
        this.email = email;
        this.notificationName = Objects.requireNonNull(notificationName, "expected parameter 'notificationName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private NotificationRecipientEmailArgs() {
        this.email = Codegen.empty();
        this.notificationName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serviceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRecipientEmailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> email;
        private Output<String> notificationName;
        private Output<String> resourceGroupName;
        private Output<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationRecipientEmailArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.notificationName = defaults.notificationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder email(@Nullable Output<String> email) {
            this.email = email;
            return this;
        }
        public Builder email(@Nullable String email) {
            this.email = Codegen.ofNullable(email);
            return this;
        }
        public Builder notificationName(Output<String> notificationName) {
            this.notificationName = Objects.requireNonNull(notificationName);
            return this;
        }
        public Builder notificationName(String notificationName) {
            this.notificationName = Output.of(Objects.requireNonNull(notificationName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }        public NotificationRecipientEmailArgs build() {
            return new NotificationRecipientEmailArgs(email, notificationName, resourceGroupName, serviceName);
        }
    }
}
