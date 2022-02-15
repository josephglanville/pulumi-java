// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMicrosoftSecurityIncidentCreationAlertRuleResult {
    private final @Nullable String alertRuleTemplateName;
    private final @Nullable String description;
    private final String displayName;
    private final @Nullable List<String> displayNamesExcludeFilter;
    private final @Nullable List<String> displayNamesFilter;
    private final Boolean enabled;
    private final @Nullable String etag;
    private final String id;
    private final String kind;
    private final String lastModifiedUtc;
    private final String name;
    private final String productFilter;
    private final @Nullable List<String> severitiesFilter;
    private final String type;

    @OutputCustomType.Constructor({"alertRuleTemplateName","description","displayName","displayNamesExcludeFilter","displayNamesFilter","enabled","etag","id","kind","lastModifiedUtc","name","productFilter","severitiesFilter","type"})
    private GetMicrosoftSecurityIncidentCreationAlertRuleResult(
        @Nullable String alertRuleTemplateName,
        @Nullable String description,
        String displayName,
        @Nullable List<String> displayNamesExcludeFilter,
        @Nullable List<String> displayNamesFilter,
        Boolean enabled,
        @Nullable String etag,
        String id,
        String kind,
        String lastModifiedUtc,
        String name,
        String productFilter,
        @Nullable List<String> severitiesFilter,
        String type) {
        this.alertRuleTemplateName = alertRuleTemplateName;
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName);
        this.displayNamesExcludeFilter = displayNamesExcludeFilter;
        this.displayNamesFilter = displayNamesFilter;
        this.enabled = Objects.requireNonNull(enabled);
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.lastModifiedUtc = Objects.requireNonNull(lastModifiedUtc);
        this.name = Objects.requireNonNull(name);
        this.productFilter = Objects.requireNonNull(productFilter);
        this.severitiesFilter = severitiesFilter;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getAlertRuleTemplateName() {
        return Optional.ofNullable(this.alertRuleTemplateName);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public String getDisplayName() {
        return this.displayName;
    }
    public List<String> getDisplayNamesExcludeFilter() {
        return this.displayNamesExcludeFilter == null ? List.of() : this.displayNamesExcludeFilter;
    }
    public List<String> getDisplayNamesFilter() {
        return this.displayNamesFilter == null ? List.of() : this.displayNamesFilter;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    public String getId() {
        return this.id;
    }
    public String getKind() {
        return this.kind;
    }
    public String getLastModifiedUtc() {
        return this.lastModifiedUtc;
    }
    public String getName() {
        return this.name;
    }
    public String getProductFilter() {
        return this.productFilter;
    }
    public List<String> getSeveritiesFilter() {
        return this.severitiesFilter == null ? List.of() : this.severitiesFilter;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMicrosoftSecurityIncidentCreationAlertRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alertRuleTemplateName;
        private @Nullable String description;
        private String displayName;
        private @Nullable List<String> displayNamesExcludeFilter;
        private @Nullable List<String> displayNamesFilter;
        private Boolean enabled;
        private @Nullable String etag;
        private String id;
        private String kind;
        private String lastModifiedUtc;
        private String name;
        private String productFilter;
        private @Nullable List<String> severitiesFilter;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMicrosoftSecurityIncidentCreationAlertRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertRuleTemplateName = defaults.alertRuleTemplateName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.displayNamesExcludeFilter = defaults.displayNamesExcludeFilter;
    	      this.displayNamesFilter = defaults.displayNamesFilter;
    	      this.enabled = defaults.enabled;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.lastModifiedUtc = defaults.lastModifiedUtc;
    	      this.name = defaults.name;
    	      this.productFilter = defaults.productFilter;
    	      this.severitiesFilter = defaults.severitiesFilter;
    	      this.type = defaults.type;
        }

        public Builder setAlertRuleTemplateName(@Nullable String alertRuleTemplateName) {
            this.alertRuleTemplateName = alertRuleTemplateName;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayNamesExcludeFilter(@Nullable List<String> displayNamesExcludeFilter) {
            this.displayNamesExcludeFilter = displayNamesExcludeFilter;
            return this;
        }

        public Builder setDisplayNamesFilter(@Nullable List<String> displayNamesFilter) {
            this.displayNamesFilter = displayNamesFilter;
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLastModifiedUtc(String lastModifiedUtc) {
            this.lastModifiedUtc = Objects.requireNonNull(lastModifiedUtc);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProductFilter(String productFilter) {
            this.productFilter = Objects.requireNonNull(productFilter);
            return this;
        }

        public Builder setSeveritiesFilter(@Nullable List<String> severitiesFilter) {
            this.severitiesFilter = severitiesFilter;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetMicrosoftSecurityIncidentCreationAlertRuleResult build() {
            return new GetMicrosoftSecurityIncidentCreationAlertRuleResult(alertRuleTemplateName, description, displayName, displayNamesExcludeFilter, displayNamesFilter, enabled, etag, id, kind, lastModifiedUtc, name, productFilter, severitiesFilter, type);
        }
    }
}