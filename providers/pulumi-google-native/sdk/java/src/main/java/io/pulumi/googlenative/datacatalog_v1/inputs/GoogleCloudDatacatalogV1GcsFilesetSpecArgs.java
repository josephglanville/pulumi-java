// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Describes a Cloud Storage fileset entry.
 * 
 */
public final class GoogleCloudDatacatalogV1GcsFilesetSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1GcsFilesetSpecArgs Empty = new GoogleCloudDatacatalogV1GcsFilesetSpecArgs();

    /**
     * Patterns to identify a set of files in Google Cloud Storage. For more information, see [Wildcard Names] (https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames). Note: Currently, bucket wildcards are not supported. Examples of valid `file_patterns`: * `gs://bucket_name/dir/*`: matches all files in `bucket_name/dir` directory * `gs://bucket_name/dir/**`: matches all files in `bucket_name/dir` and all subdirectories * `gs://bucket_name/file*`: matches files prefixed by `file` in `bucket_name` * `gs://bucket_name/??.txt`: matches files with two characters followed by `.txt` in `bucket_name` * `gs://bucket_name/[aeiou].txt`: matches files that contain a single vowel character followed by `.txt` in `bucket_name` * `gs://bucket_name/[a-m].txt`: matches files that contain `a`, `b`, ... or `m` followed by `.txt` in `bucket_name` * `gs://bucket_name/a/*{@literal /}b`: matches all files in `bucket_name` that match the `a/*{@literal /}b` pattern, such as `a/c/b`, `a/d/b` * `gs://another_bucket/a.txt`: matches `gs://another_bucket/a.txt` You can combine wildcards to match complex sets of files, for example: `gs://bucket_name/[a-m]??.j*g`
     * 
     */
    @InputImport(name="filePatterns", required=true)
      private final Output<List<String>> filePatterns;

    public Output<List<String>> getFilePatterns() {
        return this.filePatterns;
    }

    public GoogleCloudDatacatalogV1GcsFilesetSpecArgs(Output<List<String>> filePatterns) {
        this.filePatterns = Objects.requireNonNull(filePatterns, "expected parameter 'filePatterns' to be non-null");
    }

    private GoogleCloudDatacatalogV1GcsFilesetSpecArgs() {
        this.filePatterns = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1GcsFilesetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> filePatterns;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1GcsFilesetSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePatterns = defaults.filePatterns;
        }

        public Builder filePatterns(Output<List<String>> filePatterns) {
            this.filePatterns = Objects.requireNonNull(filePatterns);
            return this;
        }

        public Builder filePatterns(List<String> filePatterns) {
            this.filePatterns = Output.of(Objects.requireNonNull(filePatterns));
            return this;
        }
        public GoogleCloudDatacatalogV1GcsFilesetSpecArgs build() {
            return new GoogleCloudDatacatalogV1GcsFilesetSpecArgs(filePatterns);
        }
    }
}
