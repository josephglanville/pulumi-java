// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a script action on a running cluster.
 * 
 */
public final class RuntimeScriptActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final RuntimeScriptActionResponse Empty = new RuntimeScriptActionResponse();

    /**
     * The application name of the script action, if any.
     * 
     */
    @Import(name="applicationName", required=true)
      private final String applicationName;

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * The name of the script action.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The parameters for the script
     * 
     */
    @Import(name="parameters")
      private final @Nullable String parameters;

    public Optional<String> getParameters() {
        return this.parameters == null ? Optional.empty() : Optional.ofNullable(this.parameters);
    }

    /**
     * The list of roles where script will be executed.
     * 
     */
    @Import(name="roles", required=true)
      private final List<String> roles;

    public List<String> getRoles() {
        return this.roles;
    }

    /**
     * The URI to the script.
     * 
     */
    @Import(name="uri", required=true)
      private final String uri;

    public String getUri() {
        return this.uri;
    }

    public RuntimeScriptActionResponse(
        String applicationName,
        String name,
        @Nullable String parameters,
        List<String> roles,
        String uri) {
        this.applicationName = Objects.requireNonNull(applicationName, "expected parameter 'applicationName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = parameters;
        this.roles = Objects.requireNonNull(roles, "expected parameter 'roles' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private RuntimeScriptActionResponse() {
        this.applicationName = null;
        this.name = null;
        this.parameters = null;
        this.roles = List.of();
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeScriptActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationName;
        private String name;
        private @Nullable String parameters;
        private List<String> roles;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeScriptActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.roles = defaults.roles;
    	      this.uri = defaults.uri;
        }

        public Builder applicationName(String applicationName) {
            this.applicationName = Objects.requireNonNull(applicationName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(@Nullable String parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder roles(List<String> roles) {
            this.roles = Objects.requireNonNull(roles);
            return this;
        }
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public RuntimeScriptActionResponse build() {
            return new RuntimeScriptActionResponse(applicationName, name, parameters, roles, uri);
        }
    }
}
