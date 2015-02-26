package org.kaaproject.kaa.server.operations.service.event;

public class ClusterRouteInfo {
    protected final String tenantId;
    protected final String userId;
    protected final RouteTableAddress address;
    protected final RouteOperation routeOperation;
    
    public ClusterRouteInfo(String tenantId, String userId, RouteTableAddress address, RouteOperation routeOperation) {
        super();
        this.tenantId = tenantId;
        this.userId = userId;
        this.address = address;
        this.routeOperation = routeOperation;
    }

    public String getTenantId() {
        return tenantId;
    }

    public String getUserId() {
        return userId;
    }

    public RouteTableAddress getAddress() {
        return address;
    }

    public RouteOperation getRouteOperation() {
        return routeOperation;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((routeOperation == null) ? 0 : routeOperation.hashCode());
        result = prime * result + ((tenantId == null) ? 0 : tenantId.hashCode());
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ClusterRouteInfo other = (ClusterRouteInfo) obj;
        if (address == null) {
            if (other.address != null) {
                return false;
            }
        } else if (!address.equals(other.address)) {
            return false;
        }
        if (routeOperation != other.routeOperation) {
            return false;
        }
        if (tenantId == null) {
            if (other.tenantId != null) {
                return false;
            }
        } else if (!tenantId.equals(other.tenantId)) {
            return false;
        }
        if (userId == null) {
            if (other.userId != null) {
                return false;
            }
        } else if (!userId.equals(other.userId)) {
            return false;
        }
        return true;
    }

}
