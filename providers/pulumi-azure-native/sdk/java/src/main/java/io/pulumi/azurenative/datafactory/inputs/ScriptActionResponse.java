// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Custom script action to run on HDI ondemand cluster once it's up.
 * 
 */
public final class ScriptActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScriptActionResponse Empty = new ScriptActionResponse();

    /**
     * The user provided name of the script action.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The parameters for the script action.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable String parameters;

    public Optional<String> getParameters() {
        return this.parameters == null ? Optional.empty() : Optional.ofNullable(this.parameters);
    }

    /**
     * The node types on which the script action should be executed.
     * 
     */
    @InputImport(name="roles", required=true)
      private final Object roles;

    public Object getRoles() {
        return this.roles;
    }

    /**
     * The URI for the script action.
     * 
     */
    @InputImport(name="uri", required=true)
      private final String uri;

    public String getUri() {
        return this.uri;
    }

    public ScriptActionResponse(
        String name,
        @Nullable String parameters,
        Object roles,
        String uri) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = parameters;
        this.roles = Objects.requireNonNull(roles, "expected parameter 'roles' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private ScriptActionResponse() {
        this.name = null;
        this.parameters = null;
        this.roles = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String parameters;
        private Object roles;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ScriptActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.roles = defaults.roles;
    	      this.uri = defaults.uri;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(@Nullable String parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setRoles(Object roles) {
            this.roles = Objects.requireNonNull(roles);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public ScriptActionResponse build() {
            return new ScriptActionResponse(name, parameters, roles, uri);
        }
    }
}
