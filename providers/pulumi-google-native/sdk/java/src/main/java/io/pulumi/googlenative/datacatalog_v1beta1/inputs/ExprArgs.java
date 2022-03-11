// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of CEL are documented at https://github.com/google/cel-spec. Example (Comparison): title: "Summary size limit" description: "Determines if a summary is less than 100 chars" expression: "document.summary.size() < 100" Example (Equality): title: "Requestor is owner" description: "Determines if requestor is the document owner" expression: "document.owner == request.auth.claims.email" Example (Logic): title: "Public documents" description: "Determine whether the document should be publicly visible" expression: "document.type != 'private' && document.type != 'internal'" Example (Data Manipulation): title: "Notification string" description: "Create a notification string with a timestamp." expression: "'New message received at ' + string(document.create_time)" The exact variables and functions that may be referenced within an expression are determined by the service that evaluates it. See the service documentation for additional information.
 * 
 */
public final class ExprArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExprArgs Empty = new ExprArgs();

    /**
     * Optional. Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    @InputImport(name="expression")
      private final @Nullable Output<String> expression;

    public Output<String> getExpression() {
        return this.expression == null ? Output.empty() : this.expression;
    }

    /**
     * Optional. String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Optional. Title for the expression, i.e. a short string describing its purpose. This can be used e.g. in UIs which allow to enter the expression.
     * 
     */
    @InputImport(name="title")
      private final @Nullable Output<String> title;

    public Output<String> getTitle() {
        return this.title == null ? Output.empty() : this.title;
    }

    public ExprArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> expression,
        @Nullable Output<String> location,
        @Nullable Output<String> title) {
        this.description = description;
        this.expression = expression;
        this.location = location;
        this.title = title;
    }

    private ExprArgs() {
        this.description = Output.empty();
        this.expression = Output.empty();
        this.location = Output.empty();
        this.title = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExprArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> expression;
        private @Nullable Output<String> location;
        private @Nullable Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(ExprArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.location = defaults.location;
    	      this.title = defaults.title;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder expression(@Nullable Output<String> expression) {
            this.expression = expression;
            return this;
        }

        public Builder expression(@Nullable String expression) {
            this.expression = Output.ofNullable(expression);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }

        public Builder title(@Nullable String title) {
            this.title = Output.ofNullable(title);
            return this;
        }
        public ExprArgs build() {
            return new ExprArgs(description, expression, location, title);
        }
    }
}
