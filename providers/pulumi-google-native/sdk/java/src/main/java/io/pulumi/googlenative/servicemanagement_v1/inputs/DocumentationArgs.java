// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.servicemanagement_v1.inputs.DocumentationRuleArgs;
import io.pulumi.googlenative.servicemanagement_v1.inputs.PageArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * `Documentation` provides the information for describing a service. Example: documentation: summary: > The Google Calendar API gives access to most calendar features. pages: - name: Overview content: (== include google/foo/overview.md ==) - name: Tutorial content: (== include google/foo/tutorial.md ==) subpages; - name: Java content: (== include google/foo/tutorial_java.md ==) rules: - selector: google.calendar.Calendar.Get description: > ... - selector: google.calendar.Calendar.Put description: > ... Documentation is provided in markdown syntax. In addition to standard markdown features, definition lists, tables and fenced code blocks are supported. Section headers can be provided and are interpreted relative to the section nesting of the context where a documentation fragment is embedded. Documentation from the IDL is merged with documentation defined via the config at normalization time, where documentation provided by config rules overrides IDL provided. A number of constructs specific to the API platform are supported in documentation text. In order to reference a proto element, the following notation can be used: [fully.qualified.proto.name][] To override the display text used for the link, this can be used: [display text][fully.qualified.proto.name] Text can be excluded from doc using the following notation: (-- internal comment --) A few directives are available in documentation. Note that directives must appear on a single line to be properly identified. The `include` directive includes a markdown file from an external source: (== include path/to/file ==) The `resource_for` directive marks a message to be the resource of a collection in REST view. If it is not specified, tools attempt to infer the resource from the operations in a collection: (== resource_for v1.shelves.books ==) The directive `suppress_warning` does not directly affect documentation and is documented together with service config validation.
 * 
 */
public final class DocumentationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentationArgs Empty = new DocumentationArgs();

    /**
     * The URL to the root of documentation.
     * 
     */
    @Import(name="documentationRootUrl")
      private final @Nullable Output<String> documentationRootUrl;

    public Output<String> getDocumentationRootUrl() {
        return this.documentationRootUrl == null ? Output.empty() : this.documentationRootUrl;
    }

    /**
     * Declares a single overview page. For example: documentation: summary: ... overview: (== include overview.md ==) This is a shortcut for the following declaration (using pages style): documentation: summary: ... pages: - name: Overview content: (== include overview.md ==) Note: you cannot specify both `overview` field and `pages` field.
     * 
     */
    @Import(name="overview")
      private final @Nullable Output<String> overview;

    public Output<String> getOverview() {
        return this.overview == null ? Output.empty() : this.overview;
    }

    /**
     * The top level pages for the documentation set.
     * 
     */
    @Import(name="pages")
      private final @Nullable Output<List<PageArgs>> pages;

    public Output<List<PageArgs>> getPages() {
        return this.pages == null ? Output.empty() : this.pages;
    }

    /**
     * A list of documentation rules that apply to individual API elements. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<DocumentationRuleArgs>> rules;

    public Output<List<DocumentationRuleArgs>> getRules() {
        return this.rules == null ? Output.empty() : this.rules;
    }

    /**
     * Specifies the service root url if the default one (the service name from the yaml file) is not suitable. This can be seen in any fully specified service urls as well as sections that show a base that other urls are relative to.
     * 
     */
    @Import(name="serviceRootUrl")
      private final @Nullable Output<String> serviceRootUrl;

    public Output<String> getServiceRootUrl() {
        return this.serviceRootUrl == null ? Output.empty() : this.serviceRootUrl;
    }

    /**
     * A short description of what the service does. The summary must be plain text. It becomes the overview of the service displayed in Google Cloud Console. NOTE: This field is equivalent to the standard field `description`.
     * 
     */
    @Import(name="summary")
      private final @Nullable Output<String> summary;

    public Output<String> getSummary() {
        return this.summary == null ? Output.empty() : this.summary;
    }

    public DocumentationArgs(
        @Nullable Output<String> documentationRootUrl,
        @Nullable Output<String> overview,
        @Nullable Output<List<PageArgs>> pages,
        @Nullable Output<List<DocumentationRuleArgs>> rules,
        @Nullable Output<String> serviceRootUrl,
        @Nullable Output<String> summary) {
        this.documentationRootUrl = documentationRootUrl;
        this.overview = overview;
        this.pages = pages;
        this.rules = rules;
        this.serviceRootUrl = serviceRootUrl;
        this.summary = summary;
    }

    private DocumentationArgs() {
        this.documentationRootUrl = Output.empty();
        this.overview = Output.empty();
        this.pages = Output.empty();
        this.rules = Output.empty();
        this.serviceRootUrl = Output.empty();
        this.summary = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> documentationRootUrl;
        private @Nullable Output<String> overview;
        private @Nullable Output<List<PageArgs>> pages;
        private @Nullable Output<List<DocumentationRuleArgs>> rules;
        private @Nullable Output<String> serviceRootUrl;
        private @Nullable Output<String> summary;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentationRootUrl = defaults.documentationRootUrl;
    	      this.overview = defaults.overview;
    	      this.pages = defaults.pages;
    	      this.rules = defaults.rules;
    	      this.serviceRootUrl = defaults.serviceRootUrl;
    	      this.summary = defaults.summary;
        }

        public Builder documentationRootUrl(@Nullable Output<String> documentationRootUrl) {
            this.documentationRootUrl = documentationRootUrl;
            return this;
        }
        public Builder documentationRootUrl(@Nullable String documentationRootUrl) {
            this.documentationRootUrl = Output.ofNullable(documentationRootUrl);
            return this;
        }
        public Builder overview(@Nullable Output<String> overview) {
            this.overview = overview;
            return this;
        }
        public Builder overview(@Nullable String overview) {
            this.overview = Output.ofNullable(overview);
            return this;
        }
        public Builder pages(@Nullable Output<List<PageArgs>> pages) {
            this.pages = pages;
            return this;
        }
        public Builder pages(@Nullable List<PageArgs> pages) {
            this.pages = Output.ofNullable(pages);
            return this;
        }
        public Builder pages(PageArgs... pages) {
            return pages(List.of(pages));
        }
        public Builder rules(@Nullable Output<List<DocumentationRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<DocumentationRuleArgs> rules) {
            this.rules = Output.ofNullable(rules);
            return this;
        }
        public Builder rules(DocumentationRuleArgs... rules) {
            return rules(List.of(rules));
        }
        public Builder serviceRootUrl(@Nullable Output<String> serviceRootUrl) {
            this.serviceRootUrl = serviceRootUrl;
            return this;
        }
        public Builder serviceRootUrl(@Nullable String serviceRootUrl) {
            this.serviceRootUrl = Output.ofNullable(serviceRootUrl);
            return this;
        }
        public Builder summary(@Nullable Output<String> summary) {
            this.summary = summary;
            return this;
        }
        public Builder summary(@Nullable String summary) {
            this.summary = Output.ofNullable(summary);
            return this;
        }        public DocumentationArgs build() {
            return new DocumentationArgs(documentationRootUrl, overview, pages, rules, serviceRootUrl, summary);
        }
    }
}
