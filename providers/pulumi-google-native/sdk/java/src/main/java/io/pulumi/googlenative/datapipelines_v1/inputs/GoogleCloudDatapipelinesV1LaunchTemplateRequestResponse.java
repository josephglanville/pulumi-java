// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datapipelines_v1.inputs.GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * A request to launch a template.
 * 
 */
public final class GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse Empty = new GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse();

    /**
     * A Cloud Storage path to the template from which to create the job. Must be a valid Cloud Storage URL, beginning with 'gs://'.
     * 
     */
    @Import(name="gcsPath", required=true)
      private final String gcsPath;

    public String getGcsPath() {
        return this.gcsPath;
    }

    /**
     * The parameters of the template to launch. This should be part of the body of the POST request.
     * 
     */
    @Import(name="launchParameters", required=true)
      private final GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse launchParameters;

    public GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse getLaunchParameters() {
        return this.launchParameters;
    }

    /**
     * The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request.
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

    public GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse(
        String gcsPath,
        GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse launchParameters,
        String location,
        String project,
        Boolean validateOnly) {
        this.gcsPath = Objects.requireNonNull(gcsPath, "expected parameter 'gcsPath' to be non-null");
        this.launchParameters = Objects.requireNonNull(launchParameters, "expected parameter 'launchParameters' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.validateOnly = Objects.requireNonNull(validateOnly, "expected parameter 'validateOnly' to be non-null");
    }

    private GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse() {
        this.gcsPath = null;
        this.launchParameters = null;
        this.location = null;
        this.project = null;
        this.validateOnly = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gcsPath;
        private GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse launchParameters;
        private String location;
        private String project;
        private Boolean validateOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcsPath = defaults.gcsPath;
    	      this.launchParameters = defaults.launchParameters;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.validateOnly = defaults.validateOnly;
        }

        public Builder gcsPath(String gcsPath) {
            this.gcsPath = Objects.requireNonNull(gcsPath);
            return this;
        }
        public Builder launchParameters(GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse launchParameters) {
            this.launchParameters = Objects.requireNonNull(launchParameters);
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
        }        public GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse build() {
            return new GoogleCloudDatapipelinesV1LaunchTemplateRequestResponse(gcsPath, launchParameters, location, project, validateOnly);
        }
    }
}
