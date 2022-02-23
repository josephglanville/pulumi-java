// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMeshIstioServiceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMeshIstioServiceArgs Empty = new GetMeshIstioServiceArgs();

    /**
     * Identifier for the mesh in which this Istio service is defined.
     * Corresponds to the meshUid metric label in Istio metrics.
     * 
     */
    @InputImport(name="meshUid", required=true)
      private final String meshUid;

    public String getMeshUid() {
        return this.meshUid;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    /**
     * The name of the Istio service underlying this service.
     * Corresponds to the destination_service_name metric label in Istio metrics.
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * The namespace of the Istio service underlying this service.
     * Corresponds to the destination_service_namespace metric label in Istio metrics.
     * 
     */
    @InputImport(name="serviceNamespace", required=true)
      private final String serviceNamespace;

    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

    public GetMeshIstioServiceArgs(
        String meshUid,
        @Nullable String project,
        String serviceName,
        String serviceNamespace) {
        this.meshUid = Objects.requireNonNull(meshUid, "expected parameter 'meshUid' to be non-null");
        this.project = project;
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.serviceNamespace = Objects.requireNonNull(serviceNamespace, "expected parameter 'serviceNamespace' to be non-null");
    }

    private GetMeshIstioServiceArgs() {
        this.meshUid = null;
        this.project = null;
        this.serviceName = null;
        this.serviceNamespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMeshIstioServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String meshUid;
        private @Nullable String project;
        private String serviceName;
        private String serviceNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMeshIstioServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.meshUid = defaults.meshUid;
    	      this.project = defaults.project;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceNamespace = defaults.serviceNamespace;
        }

        public Builder setMeshUid(String meshUid) {
            this.meshUid = Objects.requireNonNull(meshUid);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceNamespace(String serviceNamespace) {
            this.serviceNamespace = Objects.requireNonNull(serviceNamespace);
            return this;
        }
        public GetMeshIstioServiceArgs build() {
            return new GetMeshIstioServiceArgs(meshUid, project, serviceName, serviceNamespace);
        }
    }
}
