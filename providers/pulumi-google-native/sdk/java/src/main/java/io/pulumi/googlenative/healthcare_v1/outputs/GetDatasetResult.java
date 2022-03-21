// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatasetResult {
    /**
     * Resource name of the dataset, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`.
     * 
     */
    private final String name;
    /**
     * The default timezone used by this dataset. Must be a either a valid IANA time zone name such as "America/New_York" or empty, which defaults to UTC. This is used for parsing times in resources, such as HL7 messages, where no explicit timezone is specified.
     * 
     */
    private final String timeZone;

    @CustomType.Constructor
    private GetDatasetResult(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("timeZone") String timeZone) {
        this.name = name;
        this.timeZone = timeZone;
    }

    /**
     * Resource name of the dataset, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The default timezone used by this dataset. Must be a either a valid IANA time zone name such as "America/New_York" or empty, which defaults to UTC. This is used for parsing times in resources, such as HL7 messages, where no explicit timezone is specified.
     * 
    */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatasetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatasetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder timeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }        public GetDatasetResult build() {
            return new GetDatasetResult(name, timeZone);
        }
    }
}
