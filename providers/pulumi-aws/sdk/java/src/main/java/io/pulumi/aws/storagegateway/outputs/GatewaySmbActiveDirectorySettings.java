// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GatewaySmbActiveDirectorySettings {
    private final @Nullable String activeDirectoryStatus;
    /**
     * List of IPv4 addresses, NetBIOS names, or host names of your domain server.
     * If you need to specify the port number include it after the colon (“:”). For example, `mydc.mydomain.com:389`.
     * 
     */
    private final @Nullable List<String> domainControllers;
    /**
     * The name of the domain that you want the gateway to join.
     * 
     */
    private final String domainName;
    /**
     * The organizational unit (OU) is a container in an Active Directory that can hold users, groups,
     * computers, and other OUs and this parameter specifies the OU that the gateway will join within the AD domain.
     * 
     */
    private final @Nullable String organizationalUnit;
    /**
     * The password of the user who has permission to add the gateway to the Active Directory domain.
     * 
     */
    private final String password;
    /**
     * Specifies the time in seconds, in which the JoinDomain operation must complete. The default is `20` seconds.
     * 
     */
    private final @Nullable Integer timeoutInSeconds;
    /**
     * The user name of user who has permission to add the gateway to the Active Directory domain.
     * 
     */
    private final String username;

    @OutputCustomType.Constructor
    private GatewaySmbActiveDirectorySettings(
        @OutputCustomType.Parameter("activeDirectoryStatus") @Nullable String activeDirectoryStatus,
        @OutputCustomType.Parameter("domainControllers") @Nullable List<String> domainControllers,
        @OutputCustomType.Parameter("domainName") String domainName,
        @OutputCustomType.Parameter("organizationalUnit") @Nullable String organizationalUnit,
        @OutputCustomType.Parameter("password") String password,
        @OutputCustomType.Parameter("timeoutInSeconds") @Nullable Integer timeoutInSeconds,
        @OutputCustomType.Parameter("username") String username) {
        this.activeDirectoryStatus = activeDirectoryStatus;
        this.domainControllers = domainControllers;
        this.domainName = domainName;
        this.organizationalUnit = organizationalUnit;
        this.password = password;
        this.timeoutInSeconds = timeoutInSeconds;
        this.username = username;
    }

    public Optional<String> getActiveDirectoryStatus() {
        return Optional.ofNullable(this.activeDirectoryStatus);
    }
    /**
     * List of IPv4 addresses, NetBIOS names, or host names of your domain server.
     * If you need to specify the port number include it after the colon (“:”). For example, `mydc.mydomain.com:389`.
     * 
    */
    public List<String> getDomainControllers() {
        return this.domainControllers == null ? List.of() : this.domainControllers;
    }
    /**
     * The name of the domain that you want the gateway to join.
     * 
    */
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * The organizational unit (OU) is a container in an Active Directory that can hold users, groups,
     * computers, and other OUs and this parameter specifies the OU that the gateway will join within the AD domain.
     * 
    */
    public Optional<String> getOrganizationalUnit() {
        return Optional.ofNullable(this.organizationalUnit);
    }
    /**
     * The password of the user who has permission to add the gateway to the Active Directory domain.
     * 
    */
    public String getPassword() {
        return this.password;
    }
    /**
     * Specifies the time in seconds, in which the JoinDomain operation must complete. The default is `20` seconds.
     * 
    */
    public Optional<Integer> getTimeoutInSeconds() {
        return Optional.ofNullable(this.timeoutInSeconds);
    }
    /**
     * The user name of user who has permission to add the gateway to the Active Directory domain.
     * 
    */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewaySmbActiveDirectorySettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String activeDirectoryStatus;
        private @Nullable List<String> domainControllers;
        private String domainName;
        private @Nullable String organizationalUnit;
        private String password;
        private @Nullable Integer timeoutInSeconds;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewaySmbActiveDirectorySettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectoryStatus = defaults.activeDirectoryStatus;
    	      this.domainControllers = defaults.domainControllers;
    	      this.domainName = defaults.domainName;
    	      this.organizationalUnit = defaults.organizationalUnit;
    	      this.password = defaults.password;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
    	      this.username = defaults.username;
        }

        public Builder setActiveDirectoryStatus(@Nullable String activeDirectoryStatus) {
            this.activeDirectoryStatus = activeDirectoryStatus;
            return this;
        }

        public Builder setDomainControllers(@Nullable List<String> domainControllers) {
            this.domainControllers = domainControllers;
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setOrganizationalUnit(@Nullable String organizationalUnit) {
            this.organizationalUnit = organizationalUnit;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setTimeoutInSeconds(@Nullable Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public GatewaySmbActiveDirectorySettings build() {
            return new GatewaySmbActiveDirectorySettings(activeDirectoryStatus, domainControllers, domainName, organizationalUnit, password, timeoutInSeconds, username);
        }
    }
}
