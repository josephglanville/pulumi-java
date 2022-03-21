// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.folder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.folder.inputs.AccessApprovalSettingsEnrolledServiceGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessApprovalSettingsState extends io.pulumi.resources.ResourceArgs {

    public static final AccessApprovalSettingsState Empty = new AccessApprovalSettingsState();

    /**
     * If the field is true, that indicates that at least one service is enrolled for Access Approval in one or more ancestors
     * of the Folder.
     * 
     */
    @Import(name="enrolledAncestor")
      private final @Nullable Output<Boolean> enrolledAncestor;

    public Output<Boolean> getEnrolledAncestor() {
        return this.enrolledAncestor == null ? Output.empty() : this.enrolledAncestor;
    }

    /**
     * A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can only be done on an all or nothing basis.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * 
     */
    @Import(name="enrolledServices")
      private final @Nullable Output<List<AccessApprovalSettingsEnrolledServiceGetArgs>> enrolledServices;

    public Output<List<AccessApprovalSettingsEnrolledServiceGetArgs>> getEnrolledServices() {
        return this.enrolledServices == null ? Output.empty() : this.enrolledServices;
    }

    /**
     * ID of the folder of the access approval settings.
     * 
     */
    @Import(name="folderId")
      private final @Nullable Output<String> folderId;

    public Output<String> getFolderId() {
        return this.folderId == null ? Output.empty() : this.folderId;
    }

    /**
     * The resource name of the settings. Format is "folders/{folder_id}/accessApprovalSettings"
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
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
        return this.notificationEmails == null ? Output.empty() : this.notificationEmails;
    }

    public AccessApprovalSettingsState(
        @Nullable Output<Boolean> enrolledAncestor,
        @Nullable Output<List<AccessApprovalSettingsEnrolledServiceGetArgs>> enrolledServices,
        @Nullable Output<String> folderId,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> notificationEmails) {
        this.enrolledAncestor = enrolledAncestor;
        this.enrolledServices = enrolledServices;
        this.folderId = folderId;
        this.name = name;
        this.notificationEmails = notificationEmails;
    }

    private AccessApprovalSettingsState() {
        this.enrolledAncestor = Output.empty();
        this.enrolledServices = Output.empty();
        this.folderId = Output.empty();
        this.name = Output.empty();
        this.notificationEmails = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessApprovalSettingsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enrolledAncestor;
        private @Nullable Output<List<AccessApprovalSettingsEnrolledServiceGetArgs>> enrolledServices;
        private @Nullable Output<String> folderId;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> notificationEmails;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessApprovalSettingsState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enrolledAncestor = defaults.enrolledAncestor;
    	      this.enrolledServices = defaults.enrolledServices;
    	      this.folderId = defaults.folderId;
    	      this.name = defaults.name;
    	      this.notificationEmails = defaults.notificationEmails;
        }

        public Builder enrolledAncestor(@Nullable Output<Boolean> enrolledAncestor) {
            this.enrolledAncestor = enrolledAncestor;
            return this;
        }
        public Builder enrolledAncestor(@Nullable Boolean enrolledAncestor) {
            this.enrolledAncestor = Output.ofNullable(enrolledAncestor);
            return this;
        }
        public Builder enrolledServices(@Nullable Output<List<AccessApprovalSettingsEnrolledServiceGetArgs>> enrolledServices) {
            this.enrolledServices = enrolledServices;
            return this;
        }
        public Builder enrolledServices(@Nullable List<AccessApprovalSettingsEnrolledServiceGetArgs> enrolledServices) {
            this.enrolledServices = Output.ofNullable(enrolledServices);
            return this;
        }
        public Builder enrolledServices(AccessApprovalSettingsEnrolledServiceGetArgs... enrolledServices) {
            return enrolledServices(List.of(enrolledServices));
        }
        public Builder folderId(@Nullable Output<String> folderId) {
            this.folderId = folderId;
            return this;
        }
        public Builder folderId(@Nullable String folderId) {
            this.folderId = Output.ofNullable(folderId);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder notificationEmails(@Nullable Output<List<String>> notificationEmails) {
            this.notificationEmails = notificationEmails;
            return this;
        }
        public Builder notificationEmails(@Nullable List<String> notificationEmails) {
            this.notificationEmails = Output.ofNullable(notificationEmails);
            return this;
        }
        public Builder notificationEmails(String... notificationEmails) {
            return notificationEmails(List.of(notificationEmails));
        }        public AccessApprovalSettingsState build() {
            return new AccessApprovalSettingsState(enrolledAncestor, enrolledServices, folderId, name, notificationEmails);
        }
    }
}
