// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.metastore_v1beta.inputs.AuditConfigArgs;
import io.pulumi.googlenative.metastore_v1beta.inputs.BindingArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceIamPolicyArgs Empty = new ServiceIamPolicyArgs();

    @InputImport(name="auditConfigs")
    private final @Nullable Input<List<AuditConfigArgs>> auditConfigs;

    public Input<List<AuditConfigArgs>> getAuditConfigs() {
        return this.auditConfigs == null ? Input.empty() : this.auditConfigs;
    }

    @InputImport(name="bindings")
    private final @Nullable Input<List<BindingArgs>> bindings;

    public Input<List<BindingArgs>> getBindings() {
        return this.bindings == null ? Input.empty() : this.bindings;
    }

    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="serviceId", required=true)
    private final Input<String> serviceId;

    public Input<String> getServiceId() {
        return this.serviceId;
    }

    @InputImport(name="updateMask")
    private final @Nullable Input<String> updateMask;

    public Input<String> getUpdateMask() {
        return this.updateMask == null ? Input.empty() : this.updateMask;
    }

    @InputImport(name="version")
    private final @Nullable Input<Integer> version;

    public Input<Integer> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public ServiceIamPolicyArgs(
        @Nullable Input<List<AuditConfigArgs>> auditConfigs,
        @Nullable Input<List<BindingArgs>> bindings,
        @Nullable Input<String> etag,
        @Nullable Input<String> location,
        @Nullable Input<String> project,
        Input<String> serviceId,
        @Nullable Input<String> updateMask,
        @Nullable Input<Integer> version) {
        this.auditConfigs = auditConfigs;
        this.bindings = bindings;
        this.etag = etag;
        this.location = location;
        this.project = project;
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
        this.updateMask = updateMask;
        this.version = version;
    }

    private ServiceIamPolicyArgs() {
        this.auditConfigs = Input.empty();
        this.bindings = Input.empty();
        this.etag = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.serviceId = Input.empty();
        this.updateMask = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AuditConfigArgs>> auditConfigs;
        private @Nullable Input<List<BindingArgs>> bindings;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;
        private Input<String> serviceId;
        private @Nullable Input<String> updateMask;
        private @Nullable Input<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditConfigs = defaults.auditConfigs;
    	      this.bindings = defaults.bindings;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.serviceId = defaults.serviceId;
    	      this.updateMask = defaults.updateMask;
    	      this.version = defaults.version;
        }

        public Builder setAuditConfigs(@Nullable Input<List<AuditConfigArgs>> auditConfigs) {
            this.auditConfigs = auditConfigs;
            return this;
        }

        public Builder setAuditConfigs(@Nullable List<AuditConfigArgs> auditConfigs) {
            this.auditConfigs = Input.ofNullable(auditConfigs);
            return this;
        }

        public Builder setBindings(@Nullable Input<List<BindingArgs>> bindings) {
            this.bindings = bindings;
            return this;
        }

        public Builder setBindings(@Nullable List<BindingArgs> bindings) {
            this.bindings = Input.ofNullable(bindings);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setServiceId(Input<String> serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }

        public Builder setServiceId(String serviceId) {
            this.serviceId = Input.of(Objects.requireNonNull(serviceId));
            return this;
        }

        public Builder setUpdateMask(@Nullable Input<String> updateMask) {
            this.updateMask = updateMask;
            return this;
        }

        public Builder setUpdateMask(@Nullable String updateMask) {
            this.updateMask = Input.ofNullable(updateMask);
            return this;
        }

        public Builder setVersion(@Nullable Input<Integer> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public ServiceIamPolicyArgs build() {
            return new ServiceIamPolicyArgs(auditConfigs, bindings, etag, location, project, serviceId, updateMask, version);
        }
    }
}