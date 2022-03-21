// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceReferenceResponse {
    /**
     * The name of the Cloud SQL instance being referenced. This does not include the project ID.
     * 
     */
    private final String name;
    /**
     * The project ID of the Cloud SQL instance being referenced. The default is the same project ID as the instance references it.
     * 
     */
    private final String project;
    /**
     * The region of the Cloud SQL instance being referenced.
     * 
     */
    private final String region;

    @CustomType.Constructor
    private InstanceReferenceResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("region") String region) {
        this.name = name;
        this.project = project;
        this.region = region;
    }

    /**
     * The name of the Cloud SQL instance being referenced. This does not include the project ID.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The project ID of the Cloud SQL instance being referenced. The default is the same project ID as the instance references it.
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * The region of the Cloud SQL instance being referenced.
     * 
    */
    public String getRegion() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String project;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }        public InstanceReferenceResponse build() {
            return new InstanceReferenceResponse(name, project, region);
        }
    }
}
