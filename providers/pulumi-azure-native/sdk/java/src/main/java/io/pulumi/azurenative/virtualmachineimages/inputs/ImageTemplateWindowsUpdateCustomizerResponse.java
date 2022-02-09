// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageTemplateWindowsUpdateCustomizerResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImageTemplateWindowsUpdateCustomizerResponse Empty = new ImageTemplateWindowsUpdateCustomizerResponse();

    @InputImport(name="filters")
    private final @Nullable List<String> filters;

    public List<String> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="searchCriteria")
    private final @Nullable String searchCriteria;

    public Optional<String> getSearchCriteria() {
        return this.searchCriteria == null ? Optional.empty() : Optional.ofNullable(this.searchCriteria);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    @InputImport(name="updateLimit")
    private final @Nullable Integer updateLimit;

    public Optional<Integer> getUpdateLimit() {
        return this.updateLimit == null ? Optional.empty() : Optional.ofNullable(this.updateLimit);
    }

    public ImageTemplateWindowsUpdateCustomizerResponse(
        @Nullable List<String> filters,
        @Nullable String name,
        @Nullable String searchCriteria,
        String type,
        @Nullable Integer updateLimit) {
        this.filters = filters;
        this.name = name;
        this.searchCriteria = searchCriteria;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.updateLimit = updateLimit;
    }

    private ImageTemplateWindowsUpdateCustomizerResponse() {
        this.filters = List.of();
        this.name = null;
        this.searchCriteria = null;
        this.type = null;
        this.updateLimit = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateWindowsUpdateCustomizerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> filters;
        private @Nullable String name;
        private @Nullable String searchCriteria;
        private String type;
        private @Nullable Integer updateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateWindowsUpdateCustomizerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.name = defaults.name;
    	      this.searchCriteria = defaults.searchCriteria;
    	      this.type = defaults.type;
    	      this.updateLimit = defaults.updateLimit;
        }

        public Builder setFilters(@Nullable List<String> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSearchCriteria(@Nullable String searchCriteria) {
            this.searchCriteria = searchCriteria;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUpdateLimit(@Nullable Integer updateLimit) {
            this.updateLimit = updateLimit;
            return this;
        }

        public ImageTemplateWindowsUpdateCustomizerResponse build() {
            return new ImageTemplateWindowsUpdateCustomizerResponse(filters, name, searchCriteria, type, updateLimit);
        }
    }
}
