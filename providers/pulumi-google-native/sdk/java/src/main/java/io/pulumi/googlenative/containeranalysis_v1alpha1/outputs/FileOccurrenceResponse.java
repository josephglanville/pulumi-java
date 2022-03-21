// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.LicenseResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class FileOccurrenceResponse {
    /**
     * This field provides a place for the SPDX data creator to record, at the file level, acknowledgements that may be needed to be communicated in some contexts
     * 
     */
    private final List<String> attributions;
    /**
     * This field provides a place for the SPDX file creator to record any general comments about the file
     * 
     */
    private final String comment;
    /**
     * This field provides a place for the SPDX file creator to record file contributors
     * 
     */
    private final List<String> contributors;
    /**
     * Identify the copyright holder of the file, as well as any dates present
     * 
     */
    private final String copyright;
    /**
     * This field contains the license information actually found in the file, if any
     * 
     */
    private final List<String> filesLicenseInfo;
    /**
     * This field contains the license the SPDX file creator has concluded as governing the file or alternative values if the governing license cannot be determined
     * 
     */
    private final LicenseResponse licenseConcluded;
    /**
     * This field provides a place for the SPDX file creator to record license notices or other such related notices found in the file
     * 
     */
    private final String notice;

    @CustomType.Constructor
    private FileOccurrenceResponse(
        @CustomType.Parameter("attributions") List<String> attributions,
        @CustomType.Parameter("comment") String comment,
        @CustomType.Parameter("contributors") List<String> contributors,
        @CustomType.Parameter("copyright") String copyright,
        @CustomType.Parameter("filesLicenseInfo") List<String> filesLicenseInfo,
        @CustomType.Parameter("licenseConcluded") LicenseResponse licenseConcluded,
        @CustomType.Parameter("notice") String notice) {
        this.attributions = attributions;
        this.comment = comment;
        this.contributors = contributors;
        this.copyright = copyright;
        this.filesLicenseInfo = filesLicenseInfo;
        this.licenseConcluded = licenseConcluded;
        this.notice = notice;
    }

    /**
     * This field provides a place for the SPDX data creator to record, at the file level, acknowledgements that may be needed to be communicated in some contexts
     * 
    */
    public List<String> getAttributions() {
        return this.attributions;
    }
    /**
     * This field provides a place for the SPDX file creator to record any general comments about the file
     * 
    */
    public String getComment() {
        return this.comment;
    }
    /**
     * This field provides a place for the SPDX file creator to record file contributors
     * 
    */
    public List<String> getContributors() {
        return this.contributors;
    }
    /**
     * Identify the copyright holder of the file, as well as any dates present
     * 
    */
    public String getCopyright() {
        return this.copyright;
    }
    /**
     * This field contains the license information actually found in the file, if any
     * 
    */
    public List<String> getFilesLicenseInfo() {
        return this.filesLicenseInfo;
    }
    /**
     * This field contains the license the SPDX file creator has concluded as governing the file or alternative values if the governing license cannot be determined
     * 
    */
    public LicenseResponse getLicenseConcluded() {
        return this.licenseConcluded;
    }
    /**
     * This field provides a place for the SPDX file creator to record license notices or other such related notices found in the file
     * 
    */
    public String getNotice() {
        return this.notice;
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
