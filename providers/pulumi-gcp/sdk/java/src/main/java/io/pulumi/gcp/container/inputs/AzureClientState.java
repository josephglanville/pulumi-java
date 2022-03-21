// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureClientState extends io.pulumi.resources.ResourceArgs {

    public static final AzureClientState Empty = new AzureClientState();

    /**
     * Required. The Azure Active Directory Application ID.
     * 
     */
    @Import(name="applicationId")
      private final @Nullable Output<String> applicationId;

    public Output<String> getApplicationId() {
        return this.applicationId == null ? Output.empty() : this.applicationId;
    }

    /**
     * Output only. The PEM encoded x509 certificate.
     * 
     */
    @Import(name="certificate")
      private final @Nullable Output<String> certificate;

    public Output<String> getCertificate() {
        return this.certificate == null ? Output.empty() : this.certificate;
    }

    /**
     * Output only. The time at which this resource was created.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime == null ? Output.empty() : this.createTime;
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of this resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The project for the resource
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Required. The Azure Active Directory Tenant ID.
     * 
     */
    @Import(name="tenantId")
      private final @Nullable Output<String> tenantId;

    public Output<String> getTenantId() {
        return this.tenantId == null ? Output.empty() : this.tenantId;
    }

    /**
     * Output only. A globally unique identifier for the client.
     * 
     */
    @Import(name="uid")
      private final @Nullable Output<String> uid;

    public Output<String> getUid() {
        return this.uid == null ? Output.empty() : this.uid;
    }

    public AzureClientState(
        @Nullable Output<String> applicationId,
        @Nullable Output<String> certificate,
        @Nullable Output<String> createTime,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> tenantId,
        @Nullable Output<String> uid) {
        this.applicationId = applicationId;
        this.certificate = certificate;
        this.createTime = createTime;
        this.location = location;
        this.name = name;
        this.project = project;
        this.tenantId = tenantId;
        this.uid = uid;
    }

    private AzureClientState() {
        this.applicationId = Output.empty();
        this.certificate = Output.empty();
        this.createTime = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.tenantId = Output.empty();
        this.uid = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClientState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applicationId;
        private @Nullable Output<String> certificate;
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> tenantId;
        private @Nullable Output<String> uid;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClientState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.certificate = defaults.certificate;
    	      this.createTime = defaults.createTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.tenantId = defaults.tenantId;
    	      this.uid = defaults.uid;
        }

        public Builder applicationId(@Nullable Output<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = Output.ofNullable(applicationId);
            return this;
        }
        public Builder certificate(@Nullable Output<String> certificate) {
            this.certificate = certificate;
            return this;
        }
        public Builder certificate(@Nullable String certificate) {
            this.certificate = Output.ofNullable(certificate);
            return this;
        }
        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Output.ofNullable(createTime);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder tenantId(@Nullable Output<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Output.ofNullable(tenantId);
            return this;
        }
        public Builder uid(@Nullable Output<String> uid) {
            this.uid = uid;
            return this;
        }
        public Builder uid(@Nullable String uid) {
            this.uid = Output.ofNullable(uid);
            return this;
        }        public AzureClientState build() {
            return new AzureClientState(applicationId, certificate, createTime, location, name, project, tenantId, uid);
        }
    }
}
