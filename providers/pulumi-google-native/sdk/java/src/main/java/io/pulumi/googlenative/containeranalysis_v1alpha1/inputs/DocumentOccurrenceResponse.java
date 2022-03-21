// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * DocumentOccurrence represents an SPDX Document Creation Information section: https://spdx.github.io/spdx-spec/2-document-creation-information/
 * 
 */
public final class DocumentOccurrenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final DocumentOccurrenceResponse Empty = new DocumentOccurrenceResponse();

    /**
     * Identify when the SPDX file was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard
     * 
     */
    @Import(name="createTime", required=true)
      private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * A field for creators of the SPDX file to provide general comments about the creation of the SPDX file or any other relevant comment not included in the other fields
     * 
     */
    @Import(name="creatorComment", required=true)
      private final String creatorComment;

    public String getCreatorComment() {
        return this.creatorComment;
    }

    /**
     * Identify who (or what, in the case of a tool) created the SPDX file. If the SPDX file was created by an individual, indicate the person's name
     * 
     */
    @Import(name="creators", required=true)
      private final List<String> creators;

    public List<String> getCreators() {
        return this.creators;
    }

    /**
     * A field for creators of the SPDX file content to provide comments to the consumers of the SPDX document
     * 
     */
    @Import(name="documentComment", required=true)
      private final String documentComment;

    public String getDocumentComment() {
        return this.documentComment;
    }

    /**
     * Identify any external SPDX documents referenced within this SPDX document
     * 
     */
    @Import(name="externalDocumentRefs", required=true)
      private final List<String> externalDocumentRefs;

    public List<String> getExternalDocumentRefs() {
        return this.externalDocumentRefs;
    }

    /**
     * A field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created
     * 
     */
    @Import(name="licenseListVersion", required=true)
      private final String licenseListVersion;

    public String getLicenseListVersion() {
        return this.licenseListVersion;
    }

    /**
     * Provide an SPDX document specific namespace as a unique absolute Uniform Resource Identifier (URI) as specified in RFC-3986, with the exception of the ‘#’ delimiter
     * 
     */
    @Import(name="namespace", required=true)
      private final String namespace;

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * Identify name of this document as designated by creator
     * 
     */
    @Import(name="title", required=true)
      private final String title;

    public String getTitle() {
        return this.title;
    }

    public DocumentOccurrenceResponse(
        String createTime,
        String creatorComment,
        List<String> creators,
        String documentComment,
        List<String> externalDocumentRefs,
        String licenseListVersion,
        String namespace,
        String title) {
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.creatorComment = Objects.requireNonNull(creatorComment, "expected parameter 'creatorComment' to be non-null");
        this.creators = Objects.requireNonNull(creators, "expected parameter 'creators' to be non-null");
        this.documentComment = Objects.requireNonNull(documentComment, "expected parameter 'documentComment' to be non-null");
        this.externalDocumentRefs = Objects.requireNonNull(externalDocumentRefs, "expected parameter 'externalDocumentRefs' to be non-null");
        this.licenseListVersion = Objects.requireNonNull(licenseListVersion, "expected parameter 'licenseListVersion' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private DocumentOccurrenceResponse() {
        this.createTime = null;
        this.creatorComment = null;
        this.creators = List.of();
        this.documentComment = null;
        this.externalDocumentRefs = List.of();
        this.licenseListVersion = null;
        this.namespace = null;
        this.title = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String creatorComment;
        private List<String> creators;
        private String documentComment;
        private List<String> externalDocumentRefs;
        private String licenseListVersion;
        private String namespace;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.creatorComment = defaults.creatorComment;
    	      this.creators = defaults.creators;
    	      this.documentComment = defaults.documentComment;
    	      this.externalDocumentRefs = defaults.externalDocumentRefs;
    	      this.licenseListVersion = defaults.licenseListVersion;
    	      this.namespace = defaults.namespace;
    	      this.title = defaults.title;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder creatorComment(String creatorComment) {
            this.creatorComment = Objects.requireNonNull(creatorComment);
            return this;
        }
        public Builder creators(List<String> creators) {
            this.creators = Objects.requireNonNull(creators);
            return this;
        }
        public Builder creators(String... creators) {
            return creators(List.of(creators));
        }
        public Builder documentComment(String documentComment) {
            this.documentComment = Objects.requireNonNull(documentComment);
            return this;
        }
        public Builder externalDocumentRefs(List<String> externalDocumentRefs) {
            this.externalDocumentRefs = Objects.requireNonNull(externalDocumentRefs);
            return this;
        }
        public Builder externalDocumentRefs(String... externalDocumentRefs) {
            return externalDocumentRefs(List.of(externalDocumentRefs));
        }
        public Builder licenseListVersion(String licenseListVersion) {
            this.licenseListVersion = Objects.requireNonNull(licenseListVersion);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public DocumentOccurrenceResponse build() {
            return new DocumentOccurrenceResponse(createTime, creatorComment, creators, documentComment, externalDocumentRefs, licenseListVersion, namespace, title);
        }
    }
}
