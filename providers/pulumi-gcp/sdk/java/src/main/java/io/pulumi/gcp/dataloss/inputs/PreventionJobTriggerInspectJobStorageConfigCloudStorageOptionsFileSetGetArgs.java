// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs Empty = new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs();

    /**
     * The regex-filtered set of files to scan.
     * Structure is documented below.
     * 
     */
    @Import(name="regexFileSet")
      private final @Nullable Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetGetArgs> regexFileSet;

    public Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetGetArgs> getRegexFileSet() {
        return this.regexFileSet == null ? Codegen.empty() : this.regexFileSet;
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
        return this.url == null ? Codegen.empty() : this.url;
    }

    public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs(
        @Nullable Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetGetArgs> regexFileSet,
        @Nullable Output<String> url) {
        this.regexFileSet = regexFileSet;
        this.url = url;
    }

    private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs() {
        this.regexFileSet = Codegen.empty();
        this.url = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetGetArgs> regexFileSet;
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regexFileSet = defaults.regexFileSet;
    	      this.url = defaults.url;
        }

        public Builder regexFileSet(@Nullable Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetGetArgs> regexFileSet) {
            this.regexFileSet = regexFileSet;
            return this;
        }
        public Builder regexFileSet(@Nullable PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetGetArgs regexFileSet) {
            this.regexFileSet = Codegen.ofNullable(regexFileSet);
            return this;
        }
        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Codegen.ofNullable(url);
            return this;
        }        public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs build() {
            return new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetGetArgs(regexFileSet, url);
        }
    }
}
