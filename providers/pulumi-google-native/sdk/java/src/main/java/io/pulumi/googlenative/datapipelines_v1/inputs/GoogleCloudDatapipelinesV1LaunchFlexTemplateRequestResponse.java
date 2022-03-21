// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datapipelines_v1.inputs.GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * A request to launch a Dataflow job from a Flex Template.
 * 
 */
public final class GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestResponse Empty = new GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestResponse();

    /**
     * Parameter to launch a job from a Flex Template.
     * 
     */
    @Import(name="launchParameter", required=true)
      private final GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse launchParameter;

    public GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse getLaunchParameter() {
        return this.launchParameter;
    }

    /**
     * The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request. For example, `us-central1`, `us-west1`.
     * 
     */
    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    /**
     * The ID of the Cloud Platform project that the job belongs to.
     * 
     */
    @Import(name="project", required=true)
      private final String project;

    public String getProject() {
        return this.project;
    }

    /**
     * If true, the request is validated but not actually executed. Defaults to false.
     * 
     */
    @Import(name="validateOnly", required=true)
      private final Boolean validateOnly;

    public Boolean getValidateOnly() {
        return this.validateOnly;
    }

    public GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestResponse(
        GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse launchParameter,
        String location,
        String project,
        Boolean validateOnly) {
        this.launchParameter = Objects.requireNonNull(launchParameter, "expected parameter 'launchParameter' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.validateOnly = Objects.requireNonNull(validateOnly, "expected parameter 'validateOnly' to be non-null");
    }

    private GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestResponse() {
        this.launchParameter = null;
        this.location = null;
        this.project = null;
        this.validateOnly = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse launchParameter;
        private String location;
        private String project;
        private Boolean validateOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchParameter = defaults.launchParameter;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.validateOnly = defaults.validateOnly;
        }

        public Builder launchParameter(GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse launchParameter) {
            this.launchParameter = Objects.requireNonNull(launchParameter);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder validateOnly(Boolean validateOnly) {
            this.validateOnly = Objects.requireNonNull(validateOnly);
            return this;
        }        public GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestResponse build() {
            return new GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestResponse(launchParameter, location, project, validateOnly);
        }
    }
}
