// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePath {
    /**
     * A url representing a file or path (no wildcards) in Cloud Storage. Example: `gs://[BUCKET_NAME]/dictionary.txt`
     * 
     */
    private final String path;

    @CustomType.Constructor
    private PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePath(@CustomType.Parameter("path") String path) {
        this.path = path;
    }

    /**
     * A url representing a file or path (no wildcards) in Cloud Storage. Example: `gs://[BUCKET_NAME]/dictionary.txt`
     * 
    */
    public String getPath() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePath defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }        public PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePath build() {
            return new PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePath(path);
        }
    }
}
