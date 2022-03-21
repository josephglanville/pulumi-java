// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs Empty = new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs();

    /**
     * The regex-filtered set of files to scan.
     * Structure is documented below.
     * 
     */
    @Import(name="regexFileSet")
      private final @Nullable Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs> regexFileSet;

    public Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs> getRegexFileSet() {
        return this.regexFileSet == null ? Output.empty() : this.regexFileSet;
    }

    /**
     * The Cloud Storage url of the file(s) to scan, in the format `gs://<bucket>/<path>`. Trailing wildcard
     * in the path is allowed.
     * If the url ends in a trailing slash, the bucket or directory represented by the url will be scanned
     * non-recursively (content in sub-directories will not be scanned). This means that `gs://mybucket/` is
     * equivalent to `gs://mybucket/*`, and `gs://mybucket/directory/` is equivalent to `gs://mybucket/directory/*`.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> getUrl() {
        return this.url == null ? Output.empty() : this.url;
    }

    public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs(
        @Nullable Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs> regexFileSet,
        @Nullable Output<String> url) {
        this.regexFileSet = regexFileSet;
        this.url = url;
    }

    private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs() {
        this.regexFileSet = Output.empty();
        this.url = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs> regexFileSet;
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regexFileSet = defaults.regexFileSet;
    	      this.url = defaults.url;
        }

        public Builder regexFileSet(@Nullable Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs> regexFileSet) {
            this.regexFileSet = regexFileSet;
            return this;
        }
        public Builder regexFileSet(@Nullable PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs regexFileSet) {
            this.regexFileSet = Output.ofNullable(regexFileSet);
            return this;
        }
        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Output.ofNullable(url);
            return this;
        }        public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs build() {
            return new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs(regexFileSet, url);
        }
    }
}
