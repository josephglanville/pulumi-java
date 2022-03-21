// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.WorkbookTemplateGalleryResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Localized template data and gallery information.
 * 
 */
public final class WorkbookTemplateLocalizedGalleryResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkbookTemplateLocalizedGalleryResponse Empty = new WorkbookTemplateLocalizedGalleryResponse();

    /**
     * Workbook galleries supported by the template.
     * 
     */
    @Import(name="galleries")
      private final @Nullable List<WorkbookTemplateGalleryResponse> galleries;

    public List<WorkbookTemplateGalleryResponse> getGalleries() {
        return this.galleries == null ? List.of() : this.galleries;
    }

    /**
     * Valid JSON object containing workbook template payload.
     * 
     */
    @Import(name="templateData")
      private final @Nullable Object templateData;

    public Optional<Object> getTemplateData() {
        return this.templateData == null ? Optional.empty() : Optional.ofNullable(this.templateData);
    }

    public WorkbookTemplateLocalizedGalleryResponse(
        @Nullable List<WorkbookTemplateGalleryResponse> galleries,
        @Nullable Object templateData) {
        this.galleries = galleries;
        this.templateData = templateData;
    }

    private WorkbookTemplateLocalizedGalleryResponse() {
        this.galleries = List.of();
        this.templateData = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkbookTemplateLocalizedGalleryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<WorkbookTemplateGalleryResponse> galleries;
        private @Nullable Object templateData;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkbookTemplateLocalizedGalleryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.galleries = defaults.galleries;
    	      this.templateData = defaults.templateData;
        }

        public Builder galleries(@Nullable List<WorkbookTemplateGalleryResponse> galleries) {
            this.galleries = galleries;
            return this;
        }
        public Builder galleries(WorkbookTemplateGalleryResponse... galleries) {
            return galleries(List.of(galleries));
        }
        public Builder templateData(@Nullable Object templateData) {
            this.templateData = templateData;
            return this;
        }        public WorkbookTemplateLocalizedGalleryResponse build() {
            return new WorkbookTemplateLocalizedGalleryResponse(galleries, templateData);
        }
    }
}
