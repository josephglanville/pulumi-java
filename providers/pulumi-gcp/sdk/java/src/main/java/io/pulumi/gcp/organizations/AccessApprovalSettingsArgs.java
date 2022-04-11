// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.organizations.inputs.AccessApprovalSettingsEnrolledServiceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessApprovalSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessApprovalSettingsArgs Empty = new AccessApprovalSettingsArgs();

    /**
     * A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can be done for individual services.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * 
     */
    @Import(name="enrolledServices", required=true)
      private final Output<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices;

    public Output<List<AccessApprovalSettingsEnrolledServiceArgs>> getEnrolledServices() {
        return this.enrolledServices;
    }

    /**
     * A list of email addresses to which notifications relating to approval requests should be sent.
     * Notifications relating to a resource will be sent to all emails in the settings of ancestor
     * resources of that resource. A maximum of 50 email addresses are allowed.
     * 
     */
    @Import(name="notificationEmails")
      private final @Nullable Output<List<String>> notificationEmails;

    public Output<List<String>> getNotificationEmails() {
        return this.notificationEmails == null ? Codegen.empty() : this.notificationEmails;
    }

    /**
     * ID of the organization of the access approval settings.
     * 
     */
    @Import(name="organizationId", required=true)
      private final Output<String> organizationId;

    public Output<String> getOrganizationId() {
        return this.organizationId;
    }

    public AccessApprovalSettingsArgs(
        Output<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices,
        @Nullable Output<List<String>> notificationEmails,
        Output<String> organizationId) {
        this.enrolledServices = Objects.requireNonNull(enrolledServices, "expected parameter 'enrolledServices' to be non-null");
        this.notificationEmails = notificationEmails;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private AccessApprovalSettingsArgs() {
        this.enrolledServices = Codegen.empty();
        this.notificationEmails = Codegen.empty();
        this.organizationId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessApprovalSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices;
        private @Nullable Output<List<String>> notificationEmails;
        private Output<String> organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessApprovalSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enrolledServices = defaults.enrolledServices;
    	      this.notificationEmails = defaults.notificationEmails;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder enrolledServices(Output<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices) {
            this.enrolledServices = Objects.requireNonNull(enrolledServices);
            return this;
        }
        public Builder enrolledServices(List<AccessApprovalSettingsEnrolledServiceArgs> enrolledServices) {
            this.enrolledServices = Output.of(Objects.requireNonNull(enrolledServices));
            return this;
        }
        public Builder enrolledServices(AccessApprovalSettingsEnrolledServiceArgs... enrolledServices) {
            return enrolledServices(List.of(enrolledServices));
        }
        public Builder notificationEmails(@Nullable Output<List<String>> notificationEmails) {
            this.notificationEmails = notificationEmails;
            return this;
        }
        public Builder notificationEmails(@Nullable List<String> notificationEmails) {
            this.notificationEmails = Codegen.ofNullable(notificationEmails);
            return this;
        }
        public Builder notificationEmails(String... notificationEmails) {
            return notificationEmails(List.of(notificationEmails));
        }
        public Builder organizationId(Output<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Output.of(Objects.requireNonNull(organizationId));
            return this;
        }        public AccessApprovalSettingsArgs build() {
            return new AccessApprovalSettingsArgs(enrolledServices, notificationEmails, organizationId);
        }
    }
}
