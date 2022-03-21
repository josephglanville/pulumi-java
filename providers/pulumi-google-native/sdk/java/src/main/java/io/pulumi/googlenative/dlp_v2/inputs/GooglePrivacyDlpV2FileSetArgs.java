// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CloudStorageRegexFileSetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Set of files to scan.
 * 
 */
public final class GooglePrivacyDlpV2FileSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2FileSetArgs Empty = new GooglePrivacyDlpV2FileSetArgs();

    /**
     * The regex-filtered set of files to scan. Exactly one of `url` or `regex_file_set` must be set.
     * 
     */
    @Import(name="regexFileSet")
      private final @Nullable Output<GooglePrivacyDlpV2CloudStorageRegexFileSetArgs> regexFileSet;

    public Output<GooglePrivacyDlpV2CloudStorageRegexFileSetArgs> getRegexFileSet() {
        return this.regexFileSet == null ? Output.empty() : this.regexFileSet;
    }

    /**
     * The Cloud Storage url of the file(s) to scan, in the format `gs:///`. Trailing wildcard in the path is allowed. If the url ends in a trailing slash, the bucket or directory represented by the url will be scanned non-recursively (content in sub-directories will not be scanned). This means that `gs://mybucket/` is equivalent to `gs://mybucket/*`, and `gs://mybucket/directory/` is equivalent to `gs://mybucket/directory/*`. Exactly one of `url` or `regex_file_set` must be set.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> getUrl() {
        return this.url == null ? Output.empty() : this.url;
    }

    public GooglePrivacyDlpV2FileSetArgs(
        @Nullable Output<GooglePrivacyDlpV2CloudStorageRegexFileSetArgs> regexFileSet,
        @Nullable Output<String> url) {
        this.regexFileSet = regexFileSet;
        this.url = url;
    }

    private GooglePrivacyDlpV2FileSetArgs() {
        this.regexFileSet = Output.empty();
        this.url = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2FileSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GooglePrivacyDlpV2CloudStorageRegexFileSetArgs> regexFileSet;
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2FileSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regexFileSet = defaults.regexFileSet;
    	      this.url = defaults.url;
        }

        public Builder regexFileSet(@Nullable Output<GooglePrivacyDlpV2CloudStorageRegexFileSetArgs> regexFileSet) {
            this.regexFileSet = regexFileSet;
            return this;
        }
        public Builder regexFileSet(@Nullable GooglePrivacyDlpV2CloudStorageRegexFileSetArgs regexFileSet) {
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
        }        public GooglePrivacyDlpV2FileSetArgs build() {
            return new GooglePrivacyDlpV2FileSetArgs(regexFileSet, url);
        }
    }
}
