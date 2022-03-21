// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.LicenseResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * FileOccurrence represents an SPDX File Information section: https://spdx.github.io/spdx-spec/4-file-information/
 * 
 */
public final class FileOccurrenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final FileOccurrenceResponse Empty = new FileOccurrenceResponse();

    /**
     * This field provides a place for the SPDX data creator to record, at the file level, acknowledgements that may be needed to be communicated in some contexts
     * 
     */
    @Import(name="attributions", required=true)
      private final List<String> attributions;

    public List<String> getAttributions() {
        return this.attributions;
    }

    /**
     * This field provides a place for the SPDX file creator to record any general comments about the file
     * 
     */
    @Import(name="comment", required=true)
      private final String comment;

    public String getComment() {
        return this.comment;
    }

    /**
     * This field provides a place for the SPDX file creator to record file contributors
     * 
     */
    @Import(name="contributors", required=true)
      private final List<String> contributors;

    public List<String> getContributors() {
        return this.contributors;
    }

    /**
     * Identify the copyright holder of the file, as well as any dates present
     * 
     */
    @Import(name="copyright", required=true)
      private final String copyright;

    public String getCopyright() {
        return this.copyright;
    }

    /**
     * This field contains the license information actually found in the file, if any
     * 
     */
    @Import(name="filesLicenseInfo", required=true)
      private final List<String> filesLicenseInfo;

    public List<String> getFilesLicenseInfo() {
        return this.filesLicenseInfo;
    }

    /**
     * This field contains the license the SPDX file creator has concluded as governing the file or alternative values if the governing license cannot be determined
     * 
     */
    @Import(name="licenseConcluded", required=true)
      private final LicenseResponse licenseConcluded;

    public LicenseResponse getLicenseConcluded() {
        return this.licenseConcluded;
    }

    /**
     * This field provides a place for the SPDX file creator to record license notices or other such related notices found in the file
     * 
     */
    @Import(name="notice", required=true)
      private final String notice;

    public String getNotice() {
        return this.notice;
    }

    public FileOccurrenceResponse(
        List<String> attributions,
        String comment,
        List<String> contributors,
        String copyright,
        List<String> filesLicenseInfo,
        LicenseResponse licenseConcluded,
        String notice) {
        this.attributions = Objects.requireNonNull(attributions, "expected parameter 'attributions' to be non-null");
        this.comment = Objects.requireNonNull(comment, "expected parameter 'comment' to be non-null");
        this.contributors = Objects.requireNonNull(contributors, "expected parameter 'contributors' to be non-null");
        this.copyright = Objects.requireNonNull(copyright, "expected parameter 'copyright' to be non-null");
        this.filesLicenseInfo = Objects.requireNonNull(filesLicenseInfo, "expected parameter 'filesLicenseInfo' to be non-null");
        this.licenseConcluded = Objects.requireNonNull(licenseConcluded, "expected parameter 'licenseConcluded' to be non-null");
        this.notice = Objects.requireNonNull(notice, "expected parameter 'notice' to be non-null");
    }

    private FileOccurrenceResponse() {
        this.attributions = List.of();
        this.comment = null;
        this.contributors = List.of();
        this.copyright = null;
        this.filesLicenseInfo = List.of();
        this.licenseConcluded = null;
        this.notice = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> attributions;
        private String comment;
        private List<String> contributors;
        private String copyright;
        private List<String> filesLicenseInfo;
        private LicenseResponse licenseConcluded;
        private String notice;

        public Builder() {
    	      // Empty
        }

        public Builder(FileOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributions = defaults.attributions;
    	      this.comment = defaults.comment;
    	      this.contributors = defaults.contributors;
    	      this.copyright = defaults.copyright;
    	      this.filesLicenseInfo = defaults.filesLicenseInfo;
    	      this.licenseConcluded = defaults.licenseConcluded;
    	      this.notice = defaults.notice;
        }

        public Builder attributions(List<String> attributions) {
            this.attributions = Objects.requireNonNull(attributions);
            return this;
        }
        public Builder attributions(String... attributions) {
            return attributions(List.of(attributions));
        }
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        public Builder contributors(List<String> contributors) {
            this.contributors = Objects.requireNonNull(contributors);
            return this;
        }
        public Builder contributors(String... contributors) {
            return contributors(List.of(contributors));
        }
        public Builder copyright(String copyright) {
            this.copyright = Objects.requireNonNull(copyright);
            return this;
        }
        public Builder filesLicenseInfo(List<String> filesLicenseInfo) {
            this.filesLicenseInfo = Objects.requireNonNull(filesLicenseInfo);
            return this;
        }
        public Builder filesLicenseInfo(String... filesLicenseInfo) {
            return filesLicenseInfo(List.of(filesLicenseInfo));
        }
        public Builder licenseConcluded(LicenseResponse licenseConcluded) {
            this.licenseConcluded = Objects.requireNonNull(licenseConcluded);
            return this;
        }
        public Builder notice(String notice) {
            this.notice = Objects.requireNonNull(notice);
            return this;
        }        public FileOccurrenceResponse build() {
            return new FileOccurrenceResponse(attributions, comment, contributors, copyright, filesLicenseInfo, licenseConcluded, notice);
        }
    }
}
